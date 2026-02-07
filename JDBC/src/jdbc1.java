import java.sql.*;

public class jdbc1 {

    private static final String url ="jdbc:mysql://localhost:3306/Forjdbc";

    private static final String username = "root";
    private static final String password = "roni0987";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement st = connection.createStatement();


            String updateQuery = "UPDATE Learner SET name = 'gourab' WHERE id = 1";
            int rows = st.executeUpdate(updateQuery);
            System.out.println(rows + " row(s) updated");

            String selectQuery = "SELECT * FROM Learner WHERE id = 1";
            ResultSet resultSet = st.executeQuery(selectQuery);

            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id"));
                System.out.println("name: " + resultSet.getString("name"));
                System.out.println("age: " + resultSet.getInt("age"));
                System.out.println("salary: " + resultSet.getDouble("salary"));
                System.out.println("----------------------");
            }

            resultSet.close();
            st.close();
            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
