<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>User Details</title>
</head>

<body>

<h2>User Details</h2>

<%
    String name = request.getParameter("username");
    String email = request.getParameter("email");
%>

Name: <%= name %> <br><br>
Email: <%= email %>

</body>
</html>