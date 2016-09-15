import java.sql.*;

/**
 * Created by ma on 15.09.2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection(
               "jdbc:postgresql://localhost:5432/students2016-practice",
               "postgres",
               "postgres"
        );
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from students");
        while (rs.next()) {
            System.out.println(rs.getString("name"));

        }
    }
}
