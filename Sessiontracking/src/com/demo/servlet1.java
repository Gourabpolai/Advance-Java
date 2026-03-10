package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        String user = req.getParameter("username");

        // 1️⃣ COOKIE
        Cookie cookie = new Cookie("user", user);
        cookie.setMaxAge(10);
        res.addCookie(cookie);

        // 2️⃣ HTTP SESSION
        HttpSession session = req.getSession();
        session.setAttribute("user", user);
        session.setMaxInactiveInterval(10);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String contextPath = req.getContextPath();

        // 3️⃣ URL REWRITING
        String servlet2URL =
                res.encodeURL(contextPath + "/servlet2?user=" + user);

        out.println("<html><body>");
        out.println("<h2>Servlet 1 Page</h2>");
        out.println("<p>Username stored using:</p>");
        out.println("<ul>");
        out.println("<li>Cookie</li>");
        out.println("<li>HttpSession</li>");
        out.println("<li>URL Rewriting</li>");
        out.println("<li>Hidden Field</li>");
        out.println("</ul>");

        // 4️⃣ Hidden Form Field
        out.println("<form action='" + servlet2URL + "' method='post'>");
        out.println("<input type='hidden' name='user' value='" + user + "'>");
        out.println("<input type='submit' value='Go to Servlet 2'>");
        out.println("</form>");

        out.println("</body></html>");
    }
}