# 🏋️ **FIT NEXUS (Spring Boot + MyBatis기반 프로젝트)**

## [FIT NEXUS(REACT) - REACT + REST API 전환 프로젝트 바로가기](https://github.com/LimeYun/MSA9_GYM_REST)



---

<p>"FIT NEXUS" 는 스마트 헬스장 통합관리 시스템입니다.</p>
<p>사용자는 QR 코드를 통합 헬스장 출입, PT 예약, 실시간 헬스장 혼잡도 파악,</p>
<p>운동계획표를 통한 일정관리가 가능합니다.</p>

![image](https://github.com/user-attachments/assets/2464dcb2-9abd-4f0b-9576-dbbd4de6fb46)

## 🎥 **프로젝트 발표 영상**  
[**발표 영상 링크**](https://www.youtube.com/watch?v=HG9iWUQFf-4)


---


# 📚 **프로젝트 목차**

### 1. 프로젝트 요약
### 2. 요구사항 및 기능 정의서
### 3. 프로젝트 ERD 및 화면 설계
### 4. 학습포인트와 보완점



---


# 1. **프로젝트 요약**

### 프로젝트 인원                 
- 5명                             

### 프로젝트 기간
- 2024-11-27 ~ 2024-12-13

### 담당 개발기능 및 구현
- **예약 기능** : **예약 CRUD**
  <p>
    권한이 트레이너인 user의 예약 데이터로 필터링하여 예약 신청 / 트레이너별 예약건 조회.
    필터링/검색/페이징을 통한 효율적인 관리.
  </p>

- **FullCalendar API 연동**
  <p>
    컨트롤러 - 자바스크립트 - 페이지로 캘린더 API 연결 / 로직 처리.
  </p>

- **관리자페이지 UI/레이아웃**
 <p>
   관리자 화면 디자인 구성
 </p>

### 사용 기술
<p>프론트엔드</p>
<p>
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white">
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white">
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=javascript&logoColor=black">
</p>
<p>백엔드</p>
<p>
  <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white">
  <img src="https://img.shields.io/badge/Spring%20Security-6DB33F?style=flat-square&logo=springsecurity&logoColor=white">
</p>
<p>데이터베이스</p>
<p>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white">
  <img src="https://img.shields.io/badge/MyBatis-000000?style=flat-square&logo=databricks&logoColor=white">
</p>
<p>기타</p>
<p>
  <img src="https://img.shields.io/badge/Figma-F24E1E?style=flat-square&logo=figma&logoColor=white">
</p>

### 예약 기능 화면

- 예약 신청

![image](https://github.com/user-attachments/assets/cc8ac9a2-0d75-4bb6-b9e1-161839823efe)


- 사용자 예약 확인

![image](https://github.com/user-attachments/assets/60266b86-be57-4f7d-98aa-abf2db0dadc5)


- 예약 관리

![image](https://github.com/user-attachments/assets/ecd83685-cbbc-445d-abd5-8c3f9602cfdb)


- 예약 관리 - 캘린더

![image](https://github.com/user-attachments/assets/951364d3-af84-4267-b9a5-c42761c1f629)


---


# 2. **요구사항 및 기능 정의서**

<details>
<summary><h2>📑 <strong>요구사항 정의서</strong></h2></summary>
  
   ![image](https://github.com/user-attachments/assets/6628cdef-0e84-469a-9f1a-c7409b145b70)
</details>


---

<details>
<summary><h2>🗒️ <strong>기능 정의서</strong></h2></summary>
  
  - 사용자(유저) 기능 정의서
 
    ![image](https://github.com/user-attachments/assets/36f473e1-be4c-412c-aa74-a4ae4850f6ea)  
  - 관리자 기능 정의서

    ![image](https://github.com/user-attachments/assets/6e0eef6f-38a4-46fc-9309-9233e7c01a9a)
</details>

---


# 3. **프로젝트 ERD 및 화면 설계**


### ERD
  
  ![ERD 이미지](https://chestnut-blinker-ca6.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F8cd794c0-c633-4008-b289-af6deeea8c4d%2F2317d53d-12bb-40e1-bf7e-43a3f29dda8a%2Fimage.png?table=block&id=16b902bd-b12f-8032-8568-e03391399423&spaceId=8cd794c0-c633-4008-b289-af6deeea8c4d&width=1920&userId=&cache=v2)



&nbsp;
### 화면 설계
                                                                                                         
<details>
  <summary><h3>🖥️ <strong>메인</strong></h3></summary>
    
  ![메인 화면 1](https://drive.google.com/uc?id=1Uc68G_fKXEXpbpQwmw_ehMtj28TQcP8E)
  ![메인 화면 2](https://drive.google.com/uc?id=1Uo2AOU0S0dM2wE4NOvHmBgi7-4WmaeVt)
  ![메인 화면 3](https://drive.google.com/uc?id=1hSRDulnuxRf6r9kk7ylSZxzFKHRB786z)
  ![메인 화면 4](https://drive.google.com/uc?id=1Up9a7utmk008C51bCwTNk0_pb48Jv1id)
  
</details>

---

<details>
  <summary><h3>👨‍💻 <strong>사용자</strong></h3></summary>
    
  ![사용자 화면 1](https://drive.google.com/uc?id=1Vns8UHr9Czb7mCp0oRkMvdlziCZicLsb)
  ![사용자 화면 2](https://drive.google.com/uc?id=1gKsHrmqugAXwskpHHzOj2QhOeXQhdDNS)
  ![사용자 화면 3](https://drive.google.com/uc?id=1hTpezJdzQLhH3LDQCH-kPDpb6x81u74a)
  ![사용자 화면 4](https://drive.google.com/uc?id=1-AcOC5ooqzOqnshUxfqrcAs0YUFyUmvD)
  ![사용자 화면 5](https://drive.google.com/uc?id=1ja-sOvZ2j7p15DMnEtXviqiN_18NJiFO)
  ![사용자 화면 6](https://drive.google.com/uc?id=1rLu826EyHDDes2J4IM-6gAtZn4Cc6fnO)
  ![사용자 화면 7](https://drive.google.com/uc?id=121WbRNX12d6LvIDWxccaLHhtfDm-Uls_)
  ![사용자 화면 8](https://drive.google.com/uc?id=15MMalJR4fd_4Sw1fhrwTd9Slbw16W2Nb)
  ![사용자 화면 9](https://drive.google.com/uc?id=1uQtkwajZWYumxgvRC3jHBNLXscEqlHeo)
  ![사용자 화면 10](https://drive.google.com/uc?id=1ZvEBl78uv1MwJyduIHh-0K1Vk6SXxbLd)
  ![사용자 화면 11](https://drive.google.com/uc?id=1mtO7EgM51fYJFiVh_QgKi_wR7rVK3xrM)
  ![사용자 화면 12](https://drive.google.com/uc?id=1gI3UU8nHksHzgKc-NwUHKV531sbQYdz4)

</details>

---

<details>
  <summary><h3>🛒 <strong>구매</strong></h3></summary>
    
  ![구매 화면 1](https://drive.google.com/uc?export=view&id=1mfs0TBP-93EDxgPWtjHDm4CnJVeJubfB)
  ![구매 화면 2](https://drive.google.com/uc?export=view&id=18RUIJA9hgrSM4asnp4GHeVSeJUM5nU2U)
  ![구매 화면 3](https://drive.google.com/uc?export=view&id=1O1zKaSeBCMyvTAML6RTrIiW_SLpC9a0Z) 
  ![구매 화면 4](https://drive.google.com/uc?export=view&id=1Vg5ufkETUEam0LcLRuNLrD_yTwCPGmRk)
  ![구매 화면 5](https://drive.google.com/uc?export=view&id=1e2nNdmhYeJwS6UnuKpsi71-YPCO8GnGT)
</details>


---

<details>
 <summary><h3>📝 <strong>게시판</strong></h3></summary>
    
  ![게시판 화면 1](https://drive.google.com/uc?id=1lhLfroTuvEUKkrS40B0SRMAAIXFGQDxh)
  ![게시판 화면 2](https://drive.google.com/uc?id=1w7vIgGkxcYcaTNVFk99gEY_SWYGc5Cb_)
</details>

---

<details>
  <summary><h3>🗓️ <strong>운동계획표</strong></h3></summary>
    
  ![운동계획표 화면](https://drive.google.com/uc?id=1sO1FP1Lua8ykdPyNZTe1AYWVymS02IGD)
</details>

---

<details>
  - <summary><h3>🛠️ <strong>관리자</strong></h3></summary>
    
  ![관리자 화면 1](https://drive.google.com/uc?id=1B8LTUYdehlfvMRUd_AXhCsrNtRSCAxP0)
  ![관리자 화면 2](https://drive.google.com/uc?id=11yqmvEDOs5DemuaqLkJ0RhJ-JkmdvOAx)
  ![관리자 화면 3](https://drive.google.com/uc?id=1gcoGjZpWV_wkz-ICyLhzw0Y9tHmcPOeP)
  ![관리자 화면 4](https://drive.google.com/uc?id=1wtZrhqDV9H6h6NplAFcTzQ8YPuzwYTKl)
  ![관리자 화면 5](https://drive.google.com/uc?id=1773uAE71llv-bJMFk-D1brLXNzU6U_ez)
  ![관리자 화면 6](https://drive.google.com/uc?id=1pjCkvkHeufRn-x5q0Bw39DPuT_83-0yX)
  ![관리자 화면 7](https://drive.google.com/uc?id=1gRzloprNVjySX3Ec0ZQm-fFzWgoKt9N8)
  ![관리자 화면 8](https://drive.google.com/uc?id=14XyRjNqg1T7f7kY1ZfO8JKdwCuqIGOdj)
  ![관리자 화면 9](https://drive.google.com/uc?id=1Dfd6QNfg9ZojGtGAkNB9r0D4V3bkWBTN)
  ![관리자 화면 10](https://drive.google.com/uc?id=1JhYmLXcIyMLIJhVfyU7UqtgbpuYWDFan)
  ![관리자 화면 11](https://drive.google.com/uc?id=1IKwCA9CU7cHNaaULMDOWbQ2KHbLP3AiX)
</details>


---



# 5. **학습포인트와 보완점**


### MVC 패턴 프로젝트 구조

Domain/Service/Mapper/Controller/.html 등 Model, View, Controller로 역할을 분리했습니다.
이 구조를 통해 비즈니스 로직과 데이터 처리를 담당하는 Model, 사용자와의 상호작용을 처리하는 Controller, 그리고 사용자에게 보여지는 화면을 구성하는 View를 명확히 구분할 수 있었습니다. 이를 통해 유지보수성과 코드 재사용성을 높였으며, 각 계층 간의 독립성을 보장할 수 있었습니다.


![image](https://github.com/user-attachments/assets/b81bf708-8433-4bee-b6f0-0c051bb7605d)


### Spring Framework

객체 관리의 제어를 Spring 에 위임하는 IoC 와 의존성을 자동으로 주입받는 DI 를 학습하고 사용했습니다.
이를 통해 객체 생성과 의존성 관리를 개발자가 직접 처리하던 방식에서 벗어나게 되었고, 보다 효율적인 기능 구현/테스트가 가능했습니다.



## 보완점

개발 단계에 있을 때 스스로 설계에 대한 더 확실한 이해가 필요하다는 점을 느꼈습니다. 
특히, 각 기능이 서로 어떻게 연결되고 의존하는지 100% 완벽하게 파악하지는 못한 상태에서 작업을 시작하면서 불필요한 수정 작업이 발생하거나 개발 속도가 느려지는 경우가 있었습니다. 그리고 캘린더 API와 데이터베이스를 연결하는 자바스크립트 코드를 작성하는 과정에서 어려움을 겪었기에, 더 깊은 언어 학습의 필요성을 느꼈습니다.

주석과 문서화를 보다 적극적으로 활용하여 협업의 효율성을 높이고, 진행 중간중간마다 전체 흐름을 점검하여 더 효율적이고 완성도 높은 프로젝트를 만들어 갈 생각입니다.
