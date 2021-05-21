package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author 18190
 * @Date: 2021/5/21  10:51
 * @VERSION 1.0
 */


public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("doFilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
