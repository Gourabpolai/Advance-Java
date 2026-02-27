package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String course = request.getParameter("course");

        out.println("<html><body>");
        out.println("<h2>Student Information</h2>");
        out.println("<hr>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Roll No:</b> " + roll + "</p>");
        out.println("<p><b>Course:</b> " + course + "</p>");
        out.println("<br><a href='student.html'>Go Back</a>");
        out.println("</body></html>");
    }
}