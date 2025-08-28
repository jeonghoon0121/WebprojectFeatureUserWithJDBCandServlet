# WebprojectFeatureUser
Webproject User 기능 Test

# PLAN
1. JDBC, 일반 서블릿으로 구현
2. mybatis, jsp로 변경
3. 추후에 스프링으로 옮기기 

# 개발환경
Java ver 17 
JDBC mysql-connector-java 8.0.33
SERVLET jakarta.servlet-api:6.1.0
TOMCAT 11.0.10
MYSQL mysql-8.4.6

# 기능분류
1. 회원가입
2. 로그인
3. 로그아웃
4. ID찾기
5. PW찾기
4. PW변경
5. 권한(admin, user)
6. 내 정보 수정
7. 소셜로그인

#DB설계

User Table
int userCode
String userID
String userPassword



#우선순위

1. 개발환경 세팅 20250827
2. 테스트
2-1 mysql 20250827
2-2 JDBC 20250827
2-2 JAVA 20250827
2-3 Servlet
   4 통합테스트
4. SQL
5. JAVA
6. JDBC
7. Servlet
8. 통합테스트 

Check
1. 객체지향
2. 보안 -prestatement 사용
         -비밀번호 나중에 암호화 기능 필요
3. 원리


   
   ver 1.0  usertest1db 조회->성공 2025-08-27
   ver 1.1 DTO 통합 ->성공 2025-08-27
   ver 1.2 DAO 통합 ->>성공 2025-08-27
   ver 1.3 mapper ->userDAO -> Application 구조 조회성공 ->>성공 2025-08-27
   ver 1.4 일반 서블릿 통합


추가할 연동 라이브러리
1. 게시판
2.

