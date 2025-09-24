package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        String name = request.getParameter("name");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>DevOps Assignment</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f0f0f0; text-align: center; }");
        out.println("h1 { color: #333; margin-top: 50px; }");
        out.println(".highlight { color: #4CAF50; font-weight: bold; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>This is assignment number 3 of <span class='highlight'>DevOps</span>!</h1>");
        out.println("<h1>Hello, <span class='highlight'>" + name + "</span>!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
