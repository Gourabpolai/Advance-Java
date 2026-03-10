<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
</head>

<body>

<h2>User Information Form</h2>

<form action="display.jsp" method="post">

    Name: <input type="text" name="username" required><br><br>

    Email: <input type="email" name="email" required><br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>