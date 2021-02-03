package com.example.proje1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        java.util.Date today = new java.util.Date();
        out.println("<html> " +
        "<body>" +
        "<h1 align=center>HF\'s Chapter1 Servlet</h1>" +
                "<br>" + today + "</body>" + "</ >");
    }

    public void destroy() {
    }
}