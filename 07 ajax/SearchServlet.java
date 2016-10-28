import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ma on 27.10.2016.
 */
public class SearchServlet extends javax.servlet.http.HttpServlet {
    private Connection conn;
    @Override
    public void init() {

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/students-2016-new",
                    "postgres",
                    "postgres");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String q = request.getParameter("q");
        if (q != null) {
            try {
                PreparedStatement st = conn.prepareStatement(
                        "select name from students where name LIKE ?"
                );
                st.setString(1, "%" + q + "%");
                ResultSet rs = st.executeQuery();
                List<String> names = new ArrayList<String>();
                JSONArray ja = new JSONArray();
                while (rs.next()) {
                    ja.put(rs.getString("name"));
                }
                JSONObject jo = new JSONObject();
                jo.put("result", ja);
                response.setContentType("text/json");
                response.getWriter().println(jo.toString());

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
