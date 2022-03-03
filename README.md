# YDU 학사관리 시스템

## 	📌개요
- **프로젝트명** : YDU 학사관리 시스템 (YD University 학사관리 시스템)
- **일정** : 21.12.3 ~ 21.12.24(3주) / 유지보수 : 21.12.24 ~

- **목적** : 거의 전국 대부분의 대학에서 사용되고 있는 학사 시스템에서 아이디어를 얻게 되었습니다. 기존의 학사 시스템의 방식은 교수자들과 학생들이 사용을 하지만 학사 시스템에서 관리자를 덧붙여 “학사관리 시스템”을 만들게 되었습니다. 관리자는 모든 시스템을(기능) 통제와 관리를 할 수 있으며, 교수자와 학생은 학사 시스템을 사용하는 역할입니다. 과거 불편했었던 본인의 대학교 학사 시스템의 UI와 기능 등을 개선하고자 기존 시스템의 기능을 아이디어를 융합하여 구현하였습니다.

## 🛠️개발환경 및 사용기술 
- **O/S**: Windows 10
- **Server**: Apache Tomcat 9
- **DB**: OracleSQL 4.1.1ver
- **FrameWork/Flatform**: STS3-3.9.14ver, Springboot, Bootstrap, Jquery, Mybatis, Aajx, Lombok
- **Programming Language**: JAVA
- **Scripting language**: JavaScript 
- **Markup language**: HTML
- **Style sheet**: CSS

### Architecture
![아키텍쳐 구성도](https://user-images.githubusercontent.com/47514354/153552691-85401eff-fd38-41af-a331-cf53d7f7c8c2.jpg)

## 	📝내용

### [YDU 학사관리 시스템 PPT link](https://www.slideshare.net/HaileyAn/ydu)
: 링크에 포함되어 있는 포트폴리오가 잘 안보이실 경우 다운로드를 통한 자세한 확인이 가능합니다.


------------
**1. 구현기능**
  - 전체 공지사항 게시판
  - 수업 공지사항 게시판
  - 대나무숲
  - 교수진 평가

**2. ERD**
![image](https://user-images.githubusercontent.com/47514354/154031312-a165a3b7-1c56-4751-9e03-627cf3518922.png)

**3. 공통 코드**
- 설명: 데이터의 유연성을 높히고 명칭의 일관성을 유지하기 위해 공통 코드를 사용하게 되었습니다. 
---
![image](https://user-images.githubusercontent.com/47514354/154031173-cf281584-0394-4efb-8270-8346702b5ad2.png)
