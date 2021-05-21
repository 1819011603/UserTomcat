package com.servlet;

import com.javaBean.User;
import com.util.UserService;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author 18190
 * @Date: 2021/5/21  14:04
 * @VERSION 1.0
 */
@WebServlet("/list")
public class ListUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = (UserService) getServletContext().getAttribute("userService");
        List<User> list = userService.getList();
        PrintWriter printWriter = resp.getWriter();
        StringBuilder mes = new StringBuilder();
        for (User user:list){
            mes.append("<p>").append(user.toString()).append("</p><br>");
        }
        printWriter.write("<html>\n" +
                "<head>\n" +
                "  <title>JSP - Hello World</title>\n" +
                "</head>\n" +
                "<body>\n" +
                  mes
                +
                "</body>\n" +
                "\n" +
                "</html>");
        printWriter.flush();
        printWriter.close();

    }
}
