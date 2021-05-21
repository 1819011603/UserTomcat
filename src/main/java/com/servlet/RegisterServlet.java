package com.servlet;

import com.javaBean.User;
import com.util.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

/**
 * @author 18190
 * @Date: 2021/5/21  13:50
 * @VERSION 1.0
 */

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name = req.getParameter("username");
         String pwd = req.getParameter("password");
         String sex = req.getParameter("sex");
         String home = req.getParameter("home");
         String info = req.getParameter("info");
         User user = new User();
         user.setHome(home);
         user.setInfo(info);
         user.setName(name);
         user.setPwd(pwd);
         user.setSex(sex);
        UserService userService = (UserService) getServletContext().getAttribute("userService");
        String flag ;
        String url;
        if(userService.addUser(user)){
            flag = "注册成功";
            System.out.println("注册成功");
            url = "login.jsp";
        }else {
            flag = "注册失败";
            System.out.println("注册失败");
            url = "register.jsp";
        }
        getServletContext().setAttribute("flag",flag);
        PrintWriter printWriter = resp.getWriter();
        String message = "<html>\n" +
                "<head>\n" +
                "  <title>register.jsp</title>\n" +

                "</head>\n" +
                "<body>\n" +

                "<h1> "+flag+"</h1>\n" +

                "</body>\n" +
                " <script>\n" +
                " function tiaozhuan(){\n" +
                "            window.location.href=\""+url+"\"\n" +
                "        }\n" +
                "        setTimeout (tiaozhuan() ,7000)"+
                "    </script>"+
                "</html>";
        printWriter.write(message);
        printWriter.flush();
        printWriter.close();




    }
}
