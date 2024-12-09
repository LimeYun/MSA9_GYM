package com.gym.gym.controller;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gym.gym.domain.Comment;
import com.gym.gym.domain.CustomUser;
import com.gym.gym.domain.Plan;
import com.gym.gym.domain.Reservation;
import com.gym.gym.service.CommentService;
import com.gym.gym.service.PlanService;
import com.gym.gym.service.ReservationService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Slf4j
@Controller
// @EnableMethodSecurity(securedEnabled = true, prePostEnabled = true)
@RequestMapping("/user/schedule")
public class PlanController {
    
    @Autowired
    PlanService planService;

    @Autowired
    CommentService commentService;

    @Autowired
    ReservationService reservationService;

    @GetMapping("/plan")
    // @PreAuthorize("hasRole('USER')")
    public String list(@AuthenticationPrincipal CustomUser userDetails, Model model) throws Exception {
        Date currentDate = new Date();

        Date commentDate = DayFirst(currentDate);
        List<Date> dates = MonthFirstLast(currentDate);

        Date startDate = dates.get(0);
        Date endDate = dates.get(1);

        Long no = userDetails.getNo();
        int iNo = no.intValue();
        
        List<Plan> planList = planService.selectByStartEnd(iNo, startDate, endDate);
        // List<Comment> commentList = commentService.selectByStartEnd(iNo, startDate, endDate);
        Comment comment = commentService.selectByDate(commentDate, iNo);
        List<Reservation> reservationList = reservationService.selectByStartEnd(iNo, startDate, endDate);

        List<Map<String, Object>> planEvents = new ArrayList<>();
        for (Plan plan : planList) {
            Map<String, Object> event = new HashMap<>();
            event.put("id", plan.getNo());
            event.put("title", plan.getPlanName());
            event.put("start", plan.getPlanTime());
            event.put("end", plan.getPlanEnd());
            event.put("description", plan.getPlanContent());
            event.put("color","#FEBC6E");
            event.put("type", "plan");
            
            planEvents.add(event);
        }

        List<Map<String, Object>> reservationEvents = new ArrayList<>();
        for (Reservation rv : reservationList) {
            Map<String, Object> event = new HashMap<>();
            event.put("id", rv.getNo());
            event.put("title", rv.getTrainerName() + "PT");
            event.put("start", rv.getRvDate());
            event.put("end", CalcOneHourLater(rv.getRvDate()));
            event.put("description", rv.getTrainerName());
            event.put("color","#64CBFF");
            event.put("type", "reservation");

            reservationEvents.add(event);
        }

        // model.addAttribute("planList", planList);
        // model.addAttribute("commentList", commentList);
        model.addAttribute("comment", comment);
        // model.addAttribute("reservationList", reservationList);

        model.addAttribute("planEvents", planEvents);
        model.addAttribute("reservationEvents", reservationEvents);

        return "/user/plan/plan";
    }

    @ResponseBody
    @GetMapping("/plan/{year}/{month}/{day}")
    // @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Map<String, Object>> listByDate(
                            @PathVariable("year") int year, 
                            @PathVariable("month") int month, 
                            @PathVariable("day") int day,
                            @AuthenticationPrincipal CustomUser userDetails, Model model) throws Exception {
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // 월은 0부터 시작하므로 -1 필요
        Date date = calendar.getTime();
        System.out.println("선택날짜(date): "+date);

        Date commentDate = DayFirst(date);
        System.out.println("선택날짜 0시0분(commentDate): " + commentDate);

        List<Date> dates = MonthFirstLast(date);
        System.out.println("선택날짜의 달 첫, 마지막 날: "+ dates);

        Date startDate = dates.get(0);
        Date endDate = dates.get(1);

        Long no = userDetails.getNo();
        int iNo = no.intValue();
        
        List<Plan> planList = planService.selectByStartEnd(iNo, startDate, endDate);
        // List<Comment> commentList = commentService.selectByStartEnd(iNo, startDate, endDate);
        Comment comment = commentService.selectByDate(commentDate, iNo);
        List<Reservation> reservationList = reservationService.selectByStartEnd(iNo, startDate, endDate);
        
        System.out.println("planList: " + planList);
        System.out.println("comment: " + comment);
        System.out.println("reservationList: "+ reservationList);

        List<Map<String, Object>> planEvents = new ArrayList<>();
        for (Plan plan : planList) {
            Map<String, Object> event = new HashMap<>();
            event.put("id", plan.getNo());
            event.put("title", plan.getPlanName());
            event.put("start", plan.getPlanTime());
            event.put("end", plan.getPlanEnd());
            event.put("description", plan.getPlanContent());
            event.put("color","#FEBC6E");
            event.put("type", "plan");
            
            planEvents.add(event);
        }

        List<Map<String, Object>> reservationEvents = new ArrayList<>();
        for (Reservation rv : reservationList) {
            Map<String, Object> event = new HashMap<>();
            event.put("id", rv.getNo());
            event.put("title", rv.getTrainerName() + "PT");
            event.put("start", rv.getRvDate());
            event.put("end", CalcOneHourLater(rv.getRvDate()));
            event.put("description", rv.getTrainerName());
            event.put("color","#64CBFF");
            event.put("type", "reservation");

            reservationEvents.add(event);
        }

        Map<String,Object> response = new HashMap<>();

        // response.put("planList", planList);
        // response.put("reservationList", reservationList);
        response.put("comment", comment);
        response.put("planEvents", planEvents);
        response.put("reservationEvents", reservationEvents);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/insert")
    public String insert(Plan plan, @AuthenticationPrincipal CustomUser userDetails) throws Exception {
        plan.setUserNo(userDetails.getNo().intValue());
        int result = planService.insert(plan);
        if (result > 0) {
            return "redirect:/user/schedule/plan";
        } 
        return "redirect:/user/schedule/insert?error";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("no") String no) throws Exception {
        int iNo = Integer.parseInt(no); // String을 int로 변환
        int result = planService.delete(iNo);
        if (result > 0) {
            return "redirect:/user/schedule/plan";
        }
        return "redirect:/user/schedule/delete?error";
    }

    @PostMapping("/update")
    public String update(Plan plan) throws Exception {
        System.out.println(plan);
        int result = planService.update(plan);
        if (result > 0) {
            return "redirect:/user/schedule/plan";
        } 
        return "redirect:/user/schedule/insert?error";
    }
    
    
    
    public List<Date> MonthFirstLast(Date date) {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
    
        // YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        // LocalDate lastDayOfMonth = yearMonth.atEndOfMonth();
    
        // 이번 달의 첫째 날의 요일 (일요일 = 0, 월요일 = 1, ...)
        int firstDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue() % 7;
    
        // 캘린더 시작 날짜: 이번 달 첫째 주의 일요일
        LocalDate calendarStartDate = firstDayOfMonth.minusDays(firstDayOfWeek);
    
        // 캘린더 종료 날짜: 마지막 주의 토요일
        LocalDate calendarEndDate = calendarStartDate.plusDays(41);
    
        Date startDate = Date.from(calendarStartDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()); // 00:00:00
        Date endDate = Date.from(calendarEndDate.atTime(23, 59, 59).atZone(ZoneId.systemDefault()).toInstant()); 
    
        List<Date> dates = new ArrayList<>();
        dates.add(startDate);
        dates.add(endDate);
    
        return dates;
    }

    public Date DayFirst(Date currentDate){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate); // 현재 날짜 설정
        
        // 시간을 0시 0분으로 설정
        calendar.set(Calendar.HOUR_OF_DAY, 0); // 0시
        calendar.set(Calendar.MINUTE, 0);       // 0분
        calendar.set(Calendar.SECOND, 0);       // 0초
        calendar.set(Calendar.MILLISECOND, 0);  // 0밀리초
        
        // 0시 0분으로 설정된 Date 객체 가져오기
        Date resetDate = calendar.getTime();

        return resetDate;
    }

    public Date CalcOneHourLater(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(Calendar.HOUR, 1);

        Date oneHourLater = calendar.getTime();

        return oneHourLater;
    }

}
