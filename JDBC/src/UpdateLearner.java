import java.sql.*;

public class UpdateLearner {

    private static final String URL =
            "jdbc:mysql://localhost:3306/Forjdbc?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "roni0987";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String sql =
                    "UPDATE Learner SET name = ?, salary = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "roni");
            ps.setDouble(2, 28000);
            ps.setInt(3, 4);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) updated");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
