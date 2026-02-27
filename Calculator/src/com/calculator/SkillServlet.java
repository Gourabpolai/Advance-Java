package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SkillServlet")
public class SkillServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        // IMPORTANT: use getParameterValues for checkbox
        String[] skills = request.getParameterValues("skill");

        out.println("<html><body>");
        out.println("<h2>Selected Skills</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");

        if (skills != null) {
            out.println("<p><b>Skills:</b></p>");
            out.println("<ul>");
            for (String skill : skills) {
                out.println("<li>" + skill + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>No skills selected.</p>");
        }

        out.println("<br><a href='skills.html'>Go Back</a>");
        out.println("</body></html>");
    }
}