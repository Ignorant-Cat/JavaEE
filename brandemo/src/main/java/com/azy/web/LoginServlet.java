package com.azy.web;

import com.azy.pojo.User;
import com.azy.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //是否记住我
        String remember = request.getParameter("remember");

        User user = userService.login(username, password);

        if(user != null){
            //登录成功

            if ("1".equals(remember)){
                //利用cookie记住我
                Cookie c_username = new Cookie("username",username);
                Cookie c_password = new Cookie("password",password);

                c_username.setMaxAge(60 * 60 * 24 * 7);
                c_password.setMaxAge(60 * 60 * 24 * 7);

                response.addCookie(c_username);
                response.addCookie(c_password);
            }

            HttpSession session = request.getSession();
            session.setAttribute("user",user);

            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath +"/selectAllServlet");

        }else {
            //登录失败
            request.setAttribute("loginMsg","用户名或密码不正确");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
