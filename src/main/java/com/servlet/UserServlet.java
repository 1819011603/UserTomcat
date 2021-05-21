package com.servlet;

import com.dao.UserDao;
import com.javaBean.User;
import com.util.UserService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 18190
 * @Date: 2021/5/21  11:23
 * @VERSION 1.0
 */

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(getServletContext().getAttribute("userService") == null){
           getServletContext().setAttribute("userService",new UserService());
        }
        UserService userService = (UserService) getServletContext().getAttribute("userService");

         String username = req.getParameter("username");
         String password = req.getParameter("password");
         User user = userService.getUserByNameAndPassWord(username,password);
         getServletContext().setAttribute("username",username);
        if (user != null){
            System.out.println("登录成功");

            resp.sendRedirect("/userTomcat/user.jsp?username="+username);
        }else {
            System.out.println("登录失败");


            resp.sendRedirect("/userTomcat/login.jsp");
        }
    }
}
