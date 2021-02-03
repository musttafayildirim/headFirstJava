package com.example.proje1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Ch2Dice extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String d1 = Integer.toString((int)((Math.random() * 6) + 1));
        String d2 = Integer.toString((int)((Math.random() * 6) + 1));

        PrintWriter out = response.getWriter();

        out.println("<html> <body>" +
            "<h1 align=center>HF\'s Chap 2 Dice Roller</h1>" +
            "<p>" + d1 + " and " + d2 + " were rolled" +
            "</body> </html>");
        }
}
