# 🏋️ **FIT NEXUS (Spring Boot + MyBatis기반 프로젝트)**

## [FIT NEXUS(REACT) - REACT + REST API 전환 프로젝트 바로가기](https://github.com/LimeYun/MSA9_GYM_REST)



---

<p>"FIT NEXUS" 는 스마트 헬스장 통합관리 시스템입니다.</p>
<p>사용자는 QR 코드를 통합 헬스장 출입, PT 예약, 실시간 헬스장 혼잡도 파악,</p>
<p>운동계획표를 통한 일정관리가 가능합니다.</p>

![image](https://github.com/user-attachments/assets/2464dcb2-9abd-4f0b-9576-dbbd4de6fb46)

## 🎥 **프로젝트 발표 영상**  
[**발표 영상 링크**](https://www.youtube.com/watch?v=HG9iWUQFf-4)



### 1. 프로젝트 요약
### 2. 프로젝트 ERD 및 화면 설계
### 3. 트러블슈팅 
### 4. 학습포인트와 보완점



---


# 1. **프로젝트 요약**

### 프로젝트 인원                 
- 5명                             

### 프로젝트 기간
- 2024-11-27 ~ 2024-12-13

### 담당 개발기능 및 구현
- **예약 CRUD**


- **FullCalendar API 연동**
:

- **관리자페이지 UI/레이아웃**
:

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
  <img src="https://img.shields.io/badge/Swagger-85EA2D?style=flat-square&logo=swagger&logoColor=black">
</p>


<details>
<summary><h2>🛠️ <strong>개발 환경</strong></h2></summary>
  
  
  ![개발 환경 이미지](https://chestnut-blinker-ca6.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F8cd794c0-c633-4008-b289-af6deeea8c4d%2Fa15b7295-4884-4d79-a760-47e8a23443c3%2Fimage.png?table=block&id=169902bd-b12f-8054-9a60-fc844af24385&spaceId=8cd794c0-c633-4008-b289-af6deeea8c4d&width=1090&userId=&cache=v2)
</details>


---

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

<details>
<summary><h2>🗂️ <strong>ERD</strong></h2></summary>
  
  ![ERD 이미지](https://chestnut-blinker-ca6.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F8cd794c0-c633-4008-b289-af6deeea8c4d%2F2317d53d-12bb-40e1-bf7e-43a3f29dda8a%2Fimage.png?table=block&id=16b902bd-b12f-8032-8568-e03391399423&spaceId=8cd794c0-c633-4008-b289-af6deeea8c4d&width=1920&userId=&cache=v2)
</details>


---

<details>
  <summary><h2>📃 <strong>테이블 정의서</strong></h2></summary>

  **users**  
  ![파일 1](https://drive.google.com/uc?export=view&id=1uIkf6OmogJD5af0uHBwp7YV3TTbpH3VZ)

  **user_auth**  
  ![파일 2](https://drive.google.com/uc?export=view&id=1jN24i-GWXzEaQF1ihnPVtD_BxswsBx_r)

  **trainer_profile**  
  ![파일 3](https://drive.google.com/uc?export=view&id=1TPs7lZxuO-pEYjJHMdNwJWV61aEUtdf9)

  **ticket**  
  ![파일 4](https://drive.google.com/uc?export=view&id=1scpM-FcbpngM4dxbmNXPtbgUdVckzusZ)

  **reservation**  
  ![파일 5](https://drive.google.com/uc?export=view&id=1xvzmCFNDani9r9_2bwRL4lEzRCZBXmIN)

  **qr_code**  
  ![파일 6](https://drive.google.com/uc?export=view&id=18iWrwLE9zu-smJXRqkG0e2l2ZFN8uTqI)

  **plan**  
  ![파일 7](https://drive.google.com/uc?export=view&id=1b2RnAr5tEDigonnXHQxR9BaWqA42da09)

  **persistent_logins**  
  ![파일 8](https://drive.google.com/uc?export=view&id=18N74mHKPW_teWLFvMnrmO_g9BT7kMB_X)

  **file**  
  ![파일 9](https://drive.google.com/uc?export=view&id=1LZ9m864zA8lH-9QELMlB3eMvwYrSozVY)

  **comment**  
  ![파일 10](https://drive.google.com/uc?export=view&id=1XMzew_jB9ZQr48ADICPEvtZIUg27Fw4E)

  **buy_list**  
  ![파일 11](https://drive.google.com/uc?export=view&id=1jBHzorTvyaTU4mbavzbr8hU-AmjM0GAV)

  **board**  
  ![파일 12](https://drive.google.com/uc?export=view&id=1EttYQgue7v7_pV5ST8ZMe9LE25uHIALg)

  **attendance**  
  ![파일 13](https://drive.google.com/uc?export=view&id=1XhCdlUg7401eCwPyEmInVpV7fgyPHMJJ)

  **answer**  
  ![파일 14](https://drive.google.com/uc?export=view&id=1ecTX_u14K37SFcFf8VHYahDJGN8yru5g)

</details>                                                                                                                    

---

&nbsp;

# ✨📊 **화면 설계**

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



&nbsp;
# 🎯 **주요 기능**
## ✅ 회원가입 및 로그인/로그아웃  
## ✅ 실시간 헬스장 이용자 수 확인  
## ✅ QR코드 기반 출입 관리  
## ✅ PT 예약 및 트레이너 스케줄 관리  
## ✅ 회원 정보 수정 및 권한 관리  
## ✅ 관리자 페이지를 통한 회원 및 예약 관리  
## ✅ 이용 통계 제공  

---


&nbsp;
<h2>📝 <strong>개별 평가</strong></h2>

<details>
<summary><h3><strong>홍성윤</strong></h3></summary>

- **한계점**: 개발 단계에 있을 때 스스로 설계에 대한 더 확실한 이해가 필요하다는 점을 느꼈습니다. 
특히, 각 기능이 서로 어떻게 연결되고 의존하는지 100% 완벽하게 파악하지는 못한 상태에서 작업을 시작하면서 불필요한 수정 작업이 발생하거나 개발 속도가 느려지는 경우가 있었습니다. 그리고 캘린더 API와 데이터베이스를 연결하는 자바스크립트 코드를 작성하는 과정에서 어려움을 겪었기에, 더 깊은 언어 학습의 필요성을 느꼈습니다.
- **보완점**: 주석과 문서화를 보다 적극적으로 활용하여 협업의 효율성을 높이고, 진행 중간중간마다 전체 흐름을 점검하여 더 효율적이고 완성도 높은 프로젝트를 만들어 갈 생각입니다.
- **소감**: 구성원들이 각자의 의견을 자유롭게 제시하고 조율했으며, 서로의 부족한 부분을 함께 도와 프로젝트를 완성했기에 좋은 시너지를 낼 수 있었습니다. 그 과정에서 협업의 중요성과 제 역량의 부족함을 깊이 깨달았으며, 더욱 전문성을 갖춘 개발자가 되기 위해 끊임없이 정진할 것을 다짐했습니다.

</details>

<details>
<summary><h3><strong>오승원</strong></h3></summary>

- **한계점**: 이번 프로젝트를 진행하며 느낀 한계점은 인공지능을 활용한 부분이 많았다는 점입니다. 물론 AI의 도움을 받는 것이 큰 도움이 되었지만, 개인적인 역량 강화를 위해 AI에 대한 의존도를 적절히 조절하고 스스로 해결하려는 노력을 좀 더 강화해야겠다고 느꼈습니다.
- **보완점**: 저희 조는 협업 과정에서 각자의 역할을 확실히 정해서 본인이 맡은 업무를 책임감을 가지고 성실히 수행한 점이 정말 좋았다고 생각합니다. 하지만 아쉬운 점은 각자의 기능을 개별적으로 잘 구현했지만 전체 시스템을 통합해보는 과정에서 예상치 못한 문제들이 생각보다 많이 발생하면서 통합 테스트의 중요성을 직접 실감했습니다. 다음 프로젝트에서는 이러한 부분을 보완하려 합니다.
- **소감**: 이번 프로젝트는 혼자서는 해결할 수 없는 문제들을 팀원들과 함께 고민하고 해결해나가는 과정에서 협업의 중요성을 많이 느끼게 된 시간입니다. 각자 맡은 역할에 책임감을 가지고 최선을 다해준 팀원들 덕분에 좋은 결과를 낼 수 있었다고 생각합니다. 또 서로의 의견을 자유롭게 제시하고 조율하는 과정에서 커뮤니케이션 스킬도 한층 더 성장했다고 생각합니다. 함께 노력해준 팀원들께 감사드립니다.
- 
</details>

<details>
<summary><h3><strong>김도현</strong></h3></summary>

- **한계점**: 프로젝트를 진행하면서 스크립트 및 API에 대한 이해도가 많이 부족하다는 것을 느꼈고 이로 인해 구현하고 싶은 기능들은 많았지만 제대로 구현하지 못해 아쉬웠던 것 같습니다.
- **보완점**: 추후 스크립트와 API를 활용할 때 익숙치 않은 부분들에 대해 더욱 다양한 코드를 작성하며 적응해가야 할 것 같습니다.
- **소감**: 이번 프로젝트는 이전 미니 프로젝트에서 얻은 경험을 바탕으로 주제 선정에서부터 팀원들과 의견을 나누며 구상을 탄탄히 다졌고, 이를 통해 프로젝트 목표를 명확히 설정하고 진행하게 되었습니다. 하지만 개발 과정을 진행하면서 수정 사항이 생길 수밖에 없다는 점을 다시 한 번 깨닫게 되었습니다. 그리고 개발 과정에서 팀원들 간 활발한 의사소통으로 각자 잘 모르는 부분을 함께 공유하고 고민하여 안 되던 기능을 하나씩 구현하는 성취감을 느낄 수 있었던 값진 경험을 하게 된 것 같습니다.

</details>

<details>
<summary><h3><strong>이세진</strong></h3></summary>
    
- **한계점**: 팀장의 역할에 대해 어려움이 있었습니다. 팀원들의 의견을 취합하고, 타협하고 설득해가며 프로젝트를 진행하였는데, 서로 너무 배려하다보니 팀장으로서 어떠한 부분에선 주도적으로 적극 추진하며 시간을 절약할 수 있었을텐데 그러지 못하여 그 점이 조금 어려웠던 것 같습니다.
- **보완점**: 위의 어려운 부분을 느껴 프로젝트를 진행하며 팀 간의 분위기를 풀어내어 더욱 소통을 활성화 시키는 방향으로 진행하였습니다. 모르는 부분이 있으면 팀원에게 물어보고, 팀원이 헤매는 것 같으면 먼저 다가가 문제를 같이 해결하기도 하였습니다. 그러하여 적극적으로 소통하게 되다보니, 프로젝트의 결정점에 대하여 시간이 점점 단축되었습니다.
- **소감**: 결제 API 를 처음 다루어보았는데, 직접 개발한 유저 데이터나 ticket(상품)에 대한 정보를 API 연동 시 담아 실행했던 것이 신기하여 기억에 남습니다. 포트원 API를 사용하였는데 처음 접하는 코드들이다 보니 어떤 코드를 담아야 하는지 생각하면서 직접 등록한 정보를 담는 방식이 재미있게 느껴졌습니다. 또한, 설계부터 시작하여 역할 분담, 개발, 테스트, 발표까지 프로젝트를 하면서 실력 향상과 실질적인 능력 향상을 많이 얻을 수 있어 뿌듯하고 보람찬 경험이었습니다.

</details>

<details>
<summary><h3><strong>조하은</strong></h3></summary>

- **한계점**: 프로젝트를 진행하면서 느꼈던 한계점은 제가 모달, 드롭다운과 같은 UI 요소들의 인터럽션 처리를 일정 추가와 같은 주요 기능 구현에 집중하다 보니, 모든 가능한 인터럽션을 처리하는 로직을 모두 구현하지 못했다는 것입니다.
- **보완점**: 코드를 구현하면서 한 파일에 코드가 길어지다 보니 에러 발생 시 디버깅하거나 호출된 함수를 추적하는 데 어려움을 겪었는데, 이로 인해 코드의 가독성과 유지보수성을 보완해야 할 필요성을 느꼈습니다.
- **소감**: 이번 프로젝트를 통해 예상보다 자바스크립트를 많이 사용하면서 배웠던 것들을 복습하거나, 새로운 지식을 배울 수 있었습니다. 그리고, FullCalendar API를 처음 사용하면서 외부 API 사용에 대한 두려움이 있었지만, API 문서를 꼼꼼히 읽고 인터넷 검색을 통해 사용해 보니 예상보다 어렵지 않다는 것을 느꼈습니다. 또, 설계 단계부터 팀원들과 활발히 의견을 나누고 모르는 것은 서로 물어보다 보니 큰 어려움 없이 프로젝트를 완료할 수 있었던 것 같습니다.

</details>






  





