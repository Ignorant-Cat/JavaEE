package com.azy.web;

import com.azy.pojo.User;
import com.azy.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();

        user.setUsername(username);
        user.setPassword(password);

        boolean flag = userService.register(user);

        if(flag){
            //注册成功
            request.setAttribute("registerMsg","注册成功，请登录！");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else {
            //注册失败
            request.setAttribute("registerMsg","用户名已存在");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
