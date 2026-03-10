<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
    <title>Date and Time</title>
</head>

<body>

<h2>Current Date and Time</h2>

<%
    Date d = new Date();
%>

Current Date and Time: <%= d %>

</body>
</html>