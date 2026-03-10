<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
    <title>Display Cookie</title>
</head>

<body>

<h2>User Information Using Cookies</h2>

<%
    String name = request.getParameter("username");
    String email = request.getParameter("email");

    /* Creating cookies */
    Cookie c1 = new Cookie("username", name);
    Cookie c2 = new Cookie("email", email);

    /* Setting cookie age */
    c1.setMaxAge(60*60);
    c2.setMaxAge(60*60);

    /* Adding cookies to response */
    response.addCookie(c1);
    response.addCookie(c2);

    /* Reading cookies */
    Cookie cookies[] = request.getCookies();

    if(cookies != null){
        for(Cookie c : cookies){
            if(c.getName().equals("username")){
                out.println("Name: " + c.getValue() + "<br>");
            }
            if(c.getName().equals("email")){
                out.println("Email: " + c.getValue());
            }
        }
    }
%>

</body>
</html>