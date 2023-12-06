package com.azy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


/*
 * request相关方法：
 * getMethod
 * getContextPath
 * getRequestURL
 * getRequestURI
 * getQueryString(get)
 * getHeader
 * getReader/getInputStream(post)
 * */

@WebServlet("/httpServletReqDemo1")
public class HttpServletReqDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String method = req.getMethod();
        System.out.println(method);

        String contextPath = req.getContextPath();
        System.out.println(contextPath);

        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL.toString());

        String requestURI = req.getRequestURI();
        System.out.println(requestURI);

        String queryString = req.getQueryString();
        System.out.println(queryString);

        //请求头各个参数的值
        String header = req.getHeader("user-agent");
        System.out.println(header);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        //post方式
        //如果是文本 getReader
        //如果是字节文件 getInputStream
        BufferedReader reader = req.getReader();
        String line = reader.readLine();
        System.out.println(line);
    }
}
