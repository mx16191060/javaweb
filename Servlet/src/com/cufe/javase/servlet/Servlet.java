package com.cufe.javase.servlet;

/*
    sun 公司制定的javaee规范：servlet规范
    servlet接口是Servlet规范中的核心接口
    接口注意：调用者是谁？实现者是谁？
 */
public interface Servlet {
    /*
        服务器端的小java程序不能随意编写，必须实现Servlet接口
     */
    void servlet();
}
