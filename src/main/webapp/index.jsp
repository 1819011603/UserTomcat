<%@ page import="com.dao.UserDao" %>
<%@ page import="com.util.UserService" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<%String user = (String) application.getAttribute("username");
  if(user == null){
    application.setAttribute("username","");

  }
  application.setAttribute("userService",new UserService());

%>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="login.jsp">登录</a>
</body>

</html>