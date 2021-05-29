package com.cufe.javase.servlet;

public class SaveServlet implements Servlet{
    @Override
    public void servlet() {
        System.out.println("连接数据库，正在保存数据");
    }
}
