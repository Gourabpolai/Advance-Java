<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>

<body>

<h2>Welcome Page</h2>

<%
    String name = request.getParameter("username");

    /* store data in session */
    session.setAttribute("user", name);

    /* get data from session */
    String user = (String) session.getAttribute("user");
%>

Welcome <%= user %>

</body>
</html>