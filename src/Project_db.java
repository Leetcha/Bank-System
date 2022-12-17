import java.sql.*;

public class Project_db {

    static final String HOST = "jdbc:mysql://localhost:3306/login";
    static final String NAME = "root";
    static final String PASSWORD = "root";

    public static Connection connection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(HOST, NAME, PASSWORD);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static ResultSet result_set (Connection con, String query) {
        Statement stat;
        ResultSet rs = null;
        try {
            stat = con.createStatement();
            rs = stat.executeQuery(query);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
