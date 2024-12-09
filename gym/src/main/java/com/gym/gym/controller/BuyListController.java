package com.gym.gym.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gym.gym.domain.BuyList;
import com.gym.gym.domain.CustomUser;
import com.gym.gym.domain.Page;
import com.gym.gym.domain.Users;
import com.gym.gym.service.BuyListService;
import com.gym.gym.service.TrainerProfileService;
import com.gym.gym.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BuyListController {

    @Autowired BuyListService buyListService;
    @Autowired UserService userService;
    @Autowired TrainerProfileService trainerProfileService;

    // 등록
    @GetMapping("/admin/sales/buyList/insert")
    public String insert() {
        return "/admin/sales/buyList/insert";
    }

    @PostMapping("/admin/sales/buyList/insert")
    public String insert(BuyList buyList) throws Exception {

        int result = buyListService.insert(buyList);

        if (result > 0) {
            return "redirect:/admin/sales/buyList";
        }
        return "admin/sales/buyList/insert/?error";
    }

    // 캔슬
    @PostMapping("/admin/sales/buyList/cancel")
    public String cancel(@RequestParam("no") int no) throws Exception {
        int result = buyListService.cancel(no);

        if (result > 0) {
            return "redirect:/admin/sales/buyList";
        }

        return "admin/sales/buyList/cancel/?error";
    }

    // 전체리스트
    @GetMapping("/admin/sales/buyList")
    public String list(Model model, @RequestParam(name = "keyword", defaultValue = "") String keyword, Page page) throws Exception {

        List<BuyList> buyList = buyListService.list(keyword, page);
        model.addAttribute("rows", page.getRows());
        model.addAttribute("page", page);
        model.addAttribute("buyList", buyList);

        return "/admin/sales/buyList";
    }

    // 매출조회
    @GetMapping("/admin/sales/salesList")
    public String salesList(@RequestParam(value = "trainerNo", required = false) Integer trainerNo,
                            @RequestParam(value = "startYear", required = false) Integer startYear,
                            @RequestParam(value = "startMonth", required = false) Integer startMonth,
                            @RequestParam(value = "startDay", required = false) Integer startDay,
                            @RequestParam(value = "endYear", required = false) Integer endYear,
                            @RequestParam(value = "endMonth", required = false) Integer endMonth,
                            @RequestParam(value = "endDay", required = false) Integer endDay,
                            @RequestParam(value = "startDate", required = false) String startDate,
                            @RequestParam(value = "endDate", required = false) String endDate,
                            Model model) throws Exception {

        LocalDate today = LocalDate.now();
        if (startYear == null || startMonth == null || startDay == null) {
            startYear = today.getYear();
            startMonth = today.getMonthValue();
            startDay = today.getDayOfMonth();
        }
        if (endYear == null || endMonth == null || endDay == null) {
            endYear = today.getYear();
            endMonth = today.getMonthValue();
            endDay = today.getDayOfMonth();
        }
    
        // 문자열로 합쳐서 시작/종료 날짜 생성
        startDate = String.format("%d-%02d-%02d", startYear, startMonth, startDay);
        endDate = String.format("%d-%02d-%02d", endYear, endMonth, endDay);
    
        model.addAttribute("selectedStartYear", startYear);
        model.addAttribute("selectedStartMonth", startMonth);
        model.addAttribute("selectedStartDay", startDay);
        model.addAttribute("selectedEndYear", endYear);
        model.addAttribute("selectedEndMonth", endMonth);
        model.addAttribute("selectedEndDay", endDay);

        List<BuyList> salesList = buyListService.salesList(trainerNo, startDate, endDate);
        model.addAttribute("salesList", salesList);

        List<Users> trainerUsers = trainerProfileService.trainerUsers();
        model.addAttribute("trainerUsers", trainerUsers);

        model.addAttribute("selectedTrainer", trainerNo);

        return "/admin/sales/salesList";
    }
    

    // 마이리스트
    @GetMapping("/user/myPage/buyList")
    public String listByUser(@AuthenticationPrincipal CustomUser userDetails, Model model) throws Exception {

        Long no = 0L;
        List<BuyList> buyList = new ArrayList<>();
        if (userDetails != null) {
            no = userDetails.getNo();
            buyList = buyListService.listByUser(no);
        }
        model.addAttribute("buyList", buyList);

        // 정상이면서 제일 오래된 이용권
        List<BuyList> filteredList = buyList.stream()
                .filter(b -> "정상".equals(b.getStatus()))
                .sorted(Comparator.comparing(BuyList::getStartDate)) // 날짜 순으로 정렬
                .collect(Collectors.toList());
        BuyList oldestBuyList = filteredList.isEmpty() ? null : filteredList.get(0);

        model.addAttribute("oldestBuyList", oldestBuyList);

        return "/user/myPage/buyList";
    }
}
