<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String type = request.getParameter("type");

    if(type.equals("admin")){
        if(username.equals("admin") && password.equals("admin123")){
            response.sendRedirect("admin.jsp");
        } else {
            out.println("Invalid Admin Login");
        }
    }
    else if(type.equals("student")){
        if(username.equals("student") && password.equals("student123")){
            response.sendRedirect("student.jsp");
        } else {
            out.println("Invalid Student Login");
        }
    }
%>