# WebprojectFeatureUser
Webproject User 기능 Test

# PLAN
1. JDBC, 일반 서블릿으로 구현
2. mybatis, jsp로 변경
3. 추후에 스프링으로 옮기기 

# 개발환경
1. Java ver 17 
2. JDBC mysql-connector-java 8.0.33
3. SERVLET jakarta.servlet-api:6.1.0
4. TOMCAT 11.0.10
5. MYSQL mysql-8.4.6

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
3-1 Servlet search 20250820
    코드 다듬기
3-2CRUD
3-3



Check
1. 객체지향
2. 보안 -prestatement 사용 
   -비밀번호 나중에 암호화 기능 필요
3. 원리


   
   ver 1.0  usertest1db 조회->성공 2025-08-27
   ver 1.1 DTO 통합 ->성공 2025-08-27
   ver 1.2 Application, DAO, DTO, SQL 연동 성공 2025-08-27
   ver 1.3 Servlet 통합 조회까지 TEST 2025-08-29

일반 서블릿
HttpServletRequest는 ServletRequest 타입 상속받아 구현
시제 사용시 HttpServletRequest 다운캐스팅 사용
데이터 전송방식
 1. get
 2. post

 메소드
 1. doget() 검색기능
 2. dopost() ket&value 전송

UTF-8지정
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println(request.getCharacterEncoding());
}

 HttpServletRequest
 HttpServletResponse
 

