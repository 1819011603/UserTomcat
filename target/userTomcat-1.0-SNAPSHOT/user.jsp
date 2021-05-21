<%--
  Created by IntelliJ IDEA.
  User: 18190
  Date: 2021/5/21
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
<p> 用户界面 : 欢迎━(*｀∀´*)ノ亻! <%= application.getAttribute("username")%></p>
<%application.setAttribute("username","");%>

<a href="/userTomcat/list"> 显示所有用户 </a>
</body>
</html>
