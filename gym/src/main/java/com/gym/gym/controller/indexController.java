package com.gym.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.gym.gym.domain.Attendance;
import com.gym.gym.domain.Option;
import com.gym.gym.domain.Page;
import com.gym.gym.service.AttendanceService;

import groovy.util.logging.Slf4j;


@Slf4j
@Controller
@RequestMapping("/index")
public class indexController {

    @Autowired
    private AttendanceService attendanceService;

    /**
     * 출석 내역 조회 (페이징 기능 포함)
     * 
     * @param model
     * @param option
     * @param page
     * @return
     */
    @GetMapping("/list")
    public String list(Model model, Option option, Page page) {
        try {
            // 서비스에서 페이징 및 검색 조건을 기반으로 데이터를 조회
            List<Attendance> attendanceList = attendanceService.list(option, page);
            int result = attendanceService.listCount();
            System.out.println("제발" + result);
            
            // 모델에 데이터 및 옵션, 페이지 정보 추가
            model.addAttribute("attendanceList", attendanceList);
            model.addAttribute("option", option);
            model.addAttribute("rows", page.getRows());
            model.addAttribute("page", page);
            model.addAttribute("result", result);

            // 페이지 URL 생성 (옵션 및 페이지 정보를 포함)
            String pageUrl = UriComponentsBuilder.fromPath("/index/list")
                    .queryParam("keyword", option.getKeyword())
                    .queryParam("code", option.getCode())
                    .queryParam("rows", page.getRows())
                    .queryParam("orderCode", option.getOrderCode())
                    .build()
                    .toUriString();

            model.addAttribute("pageUrl", pageUrl);
        } catch (Exception e) {
            model.addAttribute("errorMessage", "출석 내역 조회 중 오류가 발생했습니다.");
        }

        // 반환할 뷰 이름
        return "index";
    }
}