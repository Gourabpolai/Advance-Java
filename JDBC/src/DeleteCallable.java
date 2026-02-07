import java.sql.*;

public class DeleteCallable {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String pass = "roni0987";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            CallableStatement cs =
                    con.prepareCall("{call deleteStudent(?)}");

            cs.setInt(1, 101);

            cs.execute();
            System.out.println("Record Deleted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
