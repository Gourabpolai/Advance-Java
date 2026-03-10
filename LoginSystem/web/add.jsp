<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Addition Result</title>
</head>

<body>

<h2>Addition Result</h2>

<%
    String n1 = request.getParameter("num1");
    String n2 = request.getParameter("num2");

    int num1 = Integer.parseInt(n1);
    int num2 = Integer.parseInt(n2);

    int sum = num1 + num2;
%>

Sum = <%= sum %>

</body>
</html>