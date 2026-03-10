package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h2>Servlet 2 Page</h2>");
        out.println("<hr>");

        /* ================= COOKIE ================= */
        out.println("<h3>1️⃣ Cookie Data</h3>");
        Cookie[] cookies = req.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("user".equals(c.getName())) {
                    out.println("<p>User from Cookie: " + c.getValue() + "</p>");
                }
            }
        }

        /* ================= HTTP SESSION ================= */
        out.println("<h3>2️⃣ HttpSession Data</h3>");
        HttpSession session = req.getSession(false);

        if (session != null) {
            String user = (String) session.getAttribute("user");
            out.println("<p>User from Session: " + user + "</p>");
        }

        /* ================= URL REWRITING ================= */
        out.println("<h3>3️⃣ URL Rewriting Data</h3>");
        String urlUser = req.getParameter("user");
        if (urlUser != null) {
            out.println("<p>User from URL: " + urlUser + "</p>");
        }

        /* ================= HIDDEN FIELD ================= */
        out.println("<h3>4️⃣ Hidden Field Data</h3>");
        String hiddenUser = req.getParameter("user");
        if (hiddenUser != null) {
            out.println("<p>User from Hidden Field: " + hiddenUser + "</p>");
        }

        /* ================= SESSION TRACKING METHOD ================= */
        out.println("<hr>");
        if (req.isRequestedSessionIdFromURL()) {
            out.println("<p><b>Session tracked via URL Rewriting</b></p>");
        } else {
            out.println("<p><b>Session tracked via Cookie (JSESSIONID)</b></p>");
        }

        out.println("</body></html>");
    }
}