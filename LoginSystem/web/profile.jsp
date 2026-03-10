<%@ page language="java" %>
<%
    String name = (String)session.getAttribute("name");
    String email = (String)session.getAttribute("email");

    if(name == null){
        response.sendRedirect("login.jsp");
    }
%>

<html>
<body>

<h2>User Profile</h2>

Name: <%= name %><br>
Email: <%= email %><br><br>

<a href="home.jsp">Home</a>

</body>
</html>