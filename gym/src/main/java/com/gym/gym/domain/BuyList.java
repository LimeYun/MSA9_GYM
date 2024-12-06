package com.gym.gym.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BuyList {
    
    private int no;
    private int trainerNo;
    private int userNo;
    private int tNo;
    private Date buyDate;
    private Date canceledAt;
    private String status;
    private String userName;     // 사용자 이름
    private String trainerName;  // 트레이너 이름
    private String ticketName;   // 티켓 이름
    private int ticketPrice;    // 티켓 가격
    
}
