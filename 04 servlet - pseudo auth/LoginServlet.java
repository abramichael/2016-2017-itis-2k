import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by ma on 28.09.2016.
 */
public class LoginServlet extends HttpServlet {
    HashMap<String, String> users = new HashMap<>();

    @Override
    public void init() throws ServletException {
        super.init();
        users.put("Oleg", "parol");
        users.put("Danil", "parolOlega");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (users.containsKey(username)) {
            if (password.equals(users.get(username))) {
                request.getSession().setAttribute("current_user", username);
                response.sendRedirect("/secret");
            } else {
                response.sendRedirect("/login");
            }
        }
        else {
            response.sendRedirect("/login");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<a href=\"/guest\">Guest</a>\n" +
                "<form method=\"POST\" action=\"/login\">\n" +
                "    <input type=\"text\" name=\"username\"/>\n" +
                "    <input type=\"password\" name=\"password\"/>\n" +
                "    <input type=\"submit\" value=\"login\"/>\n" +
                "</form>");
    }
}
