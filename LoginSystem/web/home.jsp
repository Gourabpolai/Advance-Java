<%@ page language="java" %>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    session.setAttribute("name", name);
    session.setAttribute("email", email);
%>

<html>
<body>

<h2>Welcome <%= name %></h2>

<a href="profile.jsp">Profile</a> |
<a href="about.jsp">About</a> |
<a href="logout.jsp">Logout</a>

</body>
</html>