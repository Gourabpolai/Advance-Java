import java.sql.*;

public class DeleteLearner {

    private static final String URL =
            "jdbc:mysql://localhost:3306/Forjdbc?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "roni0987";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String sql =
                    "DELETE FROM Learner WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 4);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) deleted");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
