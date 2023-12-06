package com.azy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;


/*
 * request统一获取参数:
 * getParameterMap
 * getParameterValues数组
 * getParameter单个
 * */

@WebServlet("/httpServletReqDemo2")
public class HttpServletReqDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        //request  POST处理中文乱码
        req.setCharacterEncoding("UTF-8");


        //request  通用处理中文乱码
//        String username = req.getParameter("username");
//        username = new String(username.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);


        String[] hobbies = req.getParameterValues("hobby");


        System.out.println(hobbies);

        //response处理中文乱码
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("人民");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        Map<String, String[]> parameterMap = req.getParameterMap();

        for (String key : parameterMap.keySet()) {
            System.out.print(key + " : ");
            for (String map : parameterMap.get(key)) {
                System.out.print(map + " ");
            }
            System.out.println();
        }


    }
}
