package _01_HelloServletWorld;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloServletWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        Date today = new Date();
        String msg = "HelloServletWorld";

        pw.println("<html><body> <h1>" + msg + "</h1>");
        pw.println("<p>today: " + today + "</p>");
        pw.println("<body> <html>");
    }
}
