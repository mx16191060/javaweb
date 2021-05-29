package com.cufe.javase.servlet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/*
    Tomcat是webServer
    Web服务器
    Web Container
    Web 容器
    Web 容器面向Servlet接口调用
 */
public class Tomcat {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner s = new Scanner(System.in);
        System.out.println("服务器启动成功");
        System.out.println("请打开浏览器，在浏览器上输入请求路径:");
        String requestPath = s.next();
        System.out.println("您访问的资源路径是" + requestPath);
        FileReader reader = new FileReader("/Users/mx/Documents/code/java/Servlet/src/com/cufe/javase/servlet/web.txt");
        Properties pro = new Properties();
        pro.load(reader);
        String servletClassName = pro.getProperty(requestPath);
        System.out.println(servletClassName);
        Class c = Class.forName("com.cufe.javase.servlet."+servletClassName);
        Servlet servlet = (Servlet) c.newInstance();
        servlet.servlet();
    }
}
