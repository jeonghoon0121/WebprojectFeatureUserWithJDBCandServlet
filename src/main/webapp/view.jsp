<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="java.util.*, com.linkup.ManagerOfUser2.model.dto.UserDTO" %>
<!DOCTYPE html>
<html>
<head>
  <title>회원 목록</title>
</head>
<body>
<h2>회원 목록</h2>
<%
  List<UserDTO> userDTOList = (List<UserDTO>) request.getAttribute("userDTOList");

  if (userDTOList != null && !userDTOList.isEmpty()) {
    for (UserDTO userDTO : userDTOList) {
%>
<p>아이디: <%= userDTO.getUserID() %></p>
<p>비밀번호: <%= userDTO.getUserPassword() %></p>
<hr>
<%
  }
} else {
%>
<p>회원 정보가 없습니다.</p>
<%
  }
%>
</body>
</html>
