package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GreatestServlet")
public class GreatestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));

            int greatest;

            if (num1 > num2) {
                greatest = num1;
            } else {
                greatest = num2;
            }

            out.println("<html><body>");
            out.println("<h2>Result</h2>");
            out.println("<p>First Number: " + num1 + "</p>");
            out.println("<p>Second Number: " + num2 + "</p>");
            out.println("<h3>Greatest Number is: " + greatest + "</h3>");
            out.println("<br><a href='greatest.html'>Go Back</a>");
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<h3>Please enter valid numbers!</h3>");
        }
    }
}