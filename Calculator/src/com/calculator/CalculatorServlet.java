package com.calculator;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Get parameters from HTML form
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            double result = 0;

            // Perform operation
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "mul":
                    result = num1 * num2;
                    break;
                case "div":
                    if (num2 == 0) {
                        out.println("<h3>Cannot divide by zero!</h3>");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    out.println("<h3>Invalid Operation</h3>");
                    return;
            }

            // Display result
            out.println("<html><body>");
            out.println("<h2>Result: " + result + "</h2>");
            out.println("<a href='index.html'>Go Back</a>");
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<h3>Invalid Input! Please enter valid numbers.</h3>");
        }
    }
}