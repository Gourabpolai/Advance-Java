import java.sql.*;

public class callread {

    private static final String URL ="jdbc:mysql://localhost:3306/Student";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "roni0987";

    public static void main(String[] args) {

        try {
            Class.forName( "com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String query = "{call getStudentById(?)}";
            CallableStatement cs = connection.prepareCall(query);

            cs.setInt(1, 2);

            ResultSet rs = cs.executeQuery();

//            System.out.println(rs.getInt("id"));

            if (rs.next()) {   // only one time
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Grade: " + rs.getString("grade"));
            }



            rs.close();
            cs.close();
            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}