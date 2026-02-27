package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SimpleInterestServlet")
public class SimpleInterestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            double principal = Double.parseDouble(request.getParameter("principal"));
            double rate = Double.parseDouble(request.getParameter("rate"));
            double time = Double.parseDouble(request.getParameter("time"));

            double simpleInterest = (principal * rate * time) / 100;

            out.println("<html><body>");
            out.println("<h2>Simple Interest Result</h2>");
            out.println("<p>Principal: " + principal + "</p>");
            out.println("<p>Rate: " + rate + "</p>");
            out.println("<p>Time: " + time + "</p>");
            out.println("<h3>Simple Interest = " + simpleInterest + "</h3>");
            out.println("<br><a href='simpleinterest.html'>Go Back</a>");
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<h3>Please enter valid numeric values!</h3>");
        }
    }
}