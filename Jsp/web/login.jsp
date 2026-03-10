<html>
<body>

<h2>Login Page</h2>

<form action="checkLogin.jsp" method="post">

    Username: <input type="text" name="username"><br><br>

    Password: <input type="password" name="password"><br><br>

    Login Type:
    <select name="type">
        <option value="admin">Admin</option>
        <option value="student">Student</option>
    </select>

    <br><br>
    <input type="submit" value="Login">

</form>

</body>
</html>