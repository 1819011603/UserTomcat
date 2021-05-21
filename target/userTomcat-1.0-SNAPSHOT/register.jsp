<%--
  Created by IntelliJ IDEA.
  User: 18190
  Date: 2021/5/21
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>

</head>
<body>
<form action="RegisterServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username" value=""> </td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password" value=""></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="sex" value="男" > </td>
        </tr>
        <tr>
            <td>家庭地址</td>
            <td><input type="text" name="home" value="湖南长沙" > </td>
        </tr>
        <tr>
            <td>详细信息</td>
            <td><input type="text" name="info" value="真的很详细， " > </td>
        </tr>
        <tr>
            <td><input type="submit" value="登录" name="submit" ></td>
            <td><input type="reset" value="重置" name="reset"></td>
        </tr>
    </table>


</form>
</body>

</html>
