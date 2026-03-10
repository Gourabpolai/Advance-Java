<%@ page language="java" %>
<%
    String name = (String)session.getAttribute("name");

    if(name == null){
        response.sendRedirect("login.jsp");
    }
%>

<html>
<body>

<h2>About Page</h2>

Welcome <%= name %>

<br><br>

<a href="home.jsp">Home</a>

</body>
</html>