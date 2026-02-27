package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet1")   // 🔥 ADD THIS LINE
public class Servlet1 extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String user = req.getParameter("username");

        HttpSession session = req.getSession();
        session.setAttribute("user", user);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Servlet 1 page</h2>");
        out.println("<form action='Servlet2' method='post'>");
        out.println("<input type='submit' value='Go to Servlet2'>");
        out.println("</form>");
    }
}