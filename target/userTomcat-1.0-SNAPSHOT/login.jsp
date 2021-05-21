<%--
  Created by IntelliJ IDEA.
  User: 18190
  Date: 2021/5/21
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<form action="UserServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username" value= <%=application.getAttribute("username") == null?"":application.getAttribute("username")%>> </td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password" value=""></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录" name="submit"></td>
            <td><input type="reset" value="重置" name="reset"></td>
        </tr>
    </table>

    
</form>
<form action="register.jsp" method="get">
    <input type="submit" value="新用户注册">
</form>
</body>
</html>
