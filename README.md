## 학사관리 시스템



## 	📌개요
## YDU 학사관리 시스템 (YD University 학사관리 시스템)

- **목적** : 거의 전국 대부분의 대학에서 사용되고 있는 학사 시스템에서 아이디어를 얻게 되었습니다. 
             기존의 학사 시스템의 방식은 교수자들과 학생들이 사용을 하지만 학사 시스템에서 관리자를 덧붙여 **“학사관리 시스템”** 을 만들게 되었습니다. 
             관리자는 모든 시스템을(기능) 통제와 관리를 할 수 있으며, 교수자와 학생은 학사 시스템을 사용하는 역할입니다. 
             과거 불편했었던 본인의 대학교 학사 시스템의 UI와 기능 등을 개선하고자 기존 시스템의 기능을 아이디어를 융합하여 구현하였습니다.

## 🛠️개발환경 및 사용기술 
- **O/S**: Windows 10
- **Server**: Apache Tomcat 9
- **DB**: OracleSQL 4.1.1ver
- **FrameWork/Flatform**: STS3-3.9.14ver, Springboot, Bootstrap, Jquery, Mybatis, Aajx, Lombok
- **Programming Language**: JAVA
- **Scripting language**: JavaScript 
- **Markup language**: HTML
- **Style sheet**: CSS

## ✨ Demo
![ezgif com-gif-maker (1)](https://user-images.githubusercontent.com/47514354/158320457-adc25ae7-0bbd-4ea6-ba38-fa25555270d2.gif)

## 	📝내용 

### [YDU 학사관리 시스템 PPT link](https://www.slideshare.net/HaileyAn/ydu)
: 링크에 포함되어 있는 포트폴리오가 잘 안보이실 경우 다운로드를 통한 자세한 확인이 가능합니다.


------------
**1. 구현기능**

  > 각 **권한**을 **관리자,교수자,학생** 으로 구분하여 **관리자는 모든 통제 권한**을 가지며 게시판과 댓글을 삭제 할 수 있습니다. 이외에 **부트스트랩을 제외한 모든 디자인과 백엔드 포지션을 담당**하였습니다.

 - **전체 공지사항 게시판** 
 
    - 전체 공지사항 게시판은 **관리자**만 **글 작성,수정,삭제**를 할 수 있습니다.
  **관리자 본인이 쓴 글 이외의 다른 관리자의 글은 수정및 삭제가 불가능**하며 읽기만 가능합니다. **게시판(CRUD)과 댓글(CRUD)을** 구현했습니다.
 
 
 - **수업 공지사항 게시판**
  
    - 수업 공지사항 게시판은 **교수자**만 **글 작성,수정,삭제**를 할 수 있습니다.
    **교수자 본인이 쓴 글 이외의 다른 교수자의 글은 수정 및 삭제가 불가능**하며 읽기만 가능합니다. **게시판(CRUD)과 댓글(CRUD)을** 구현했습니다.
    
  - **대나무숲**
  
    ![캡처11](https://user-images.githubusercontent.com/47514354/158324344-1d07a3da-0cbd-43f4-ab5b-1ecef438722d.png)
    - 대나무숲은 **학생**만 **글 작성, 수정, 삭제**를 할 수 있습니다.
     작성폼 밑에서부터 내림차순 형식으로 글이 쌓이는 형식이며 **작성자는 익명**으로 나타냅니다. **학생 본인이 쓴 글 이외의 다른 학생의 글은 수정 및 삭제가 불가능**하며 읽기만 가능합니다.
    
  - **My 대나무숲 조회**
    
    - 학생의 사이드바에서만 볼 수 있으며 My 대나무숲 조회는 여태 본인이 작성한 대나무숲 글들을 조회 할 수 있으며 즉시 삭제가 가능합니다.
  - 교수진 평가

  - **교수진 평가**
![image](https://user-images.githubusercontent.com/47514354/158326978-01a44c32-a3ff-45dd-a4cc-ce1d6abd6d70.png)
    - 수업이 종료된 과목에 한해서 학생은 교수자의 평점을 줄 수 있습니다. 각 학생들은 1~5 사이의 숫자를 가지고 교수의 수업을 평가합니다.
    한번 평가글을 작성하면 수정하지 못하고 글 삭제만 가능합니다.(새로 작성은 불가능합니다) **누구에게나 공개**가 되며 교수진 평가 게시판에는 여태까지 받은 **평점의 평균(소수점 첫째자리까지)과 교수의 성함, 과목이 노출**이 됩니다. 교수진 평가 게시판은 **전체검색 기능을 추가**하였습니다.

**2. ERD**
![image](https://user-images.githubusercontent.com/47514354/154031312-a165a3b7-1c56-4751-9e03-627cf3518922.png)

**3. 공통 코드**
- 설명: 데이터의 유연성을 높히고 명칭의 일관성을 유지하기 위해 공통 코드를 사용하게 되었습니다. 
---
![image](https://user-images.githubusercontent.com/47514354/154031173-cf281584-0394-4efb-8270-8346702b5ad2.png)
