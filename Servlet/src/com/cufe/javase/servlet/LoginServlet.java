package com.cufe.javase.servlet;

public class LoginServlet implements Servlet{

    @Override
    public void servlet() {
        System.out.println("连接数据库，正在验证用户名和密码");
    }
}
