package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ma on 31.10.2016.
 */
public class DBConnectionHelper {
    private static final String URL =
            "jdbc:postgresql://localhost:5432/students-2016-new";
    private static final String USER = "postgres";
    private static final String PSSWD = "postgres";
    private static Connection conn;
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(
                        URL, USER, PSSWD
                );
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
