import java.sql.*;
public class delete {
    private static final String URL = "jdbc:mysql://localhost:3306/forjdbc";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "roni0987";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement st = connection.createStatement();
            String query = "DELETE FROM Learner WHERE id = 2";
            int rowsDeleted = st.executeUpdate(query);
            if (rowsDeleted > 0) {
                System.out.println("Record deleted successfully!");
            } else {
                System.out.println("No record found with given ID.");
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
