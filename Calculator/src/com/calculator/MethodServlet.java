package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/MethodServlet")
public class MethodServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        // IMPORTANT LINE
        String methodUsed = request.getMethod();

        out.println("<html><body>");
        out.println("<h2>HTTP Method Information</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<h3>HTTP Method Used: " + methodUsed + "</h3>");
        out.println("<br><a href='method.html'>Go Back</a>");
        out.println("</body></html>");
    }
}