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
        users.put("oleg", "parol");
        users.put("danil", "parolOlega");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username").toLowerCase();
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
                response.sendRedirect("/login?err=Incorrect Password&username=" + username);
            }
        }
        else {
            response.sendRedirect("/login?err=Wrong Username&username=" + username);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String err = request.getParameter("err");
        String username = request.getParameter("username");
        response.getWriter().println("<a href=\"/guest\">Guest</a>\n" +
                (err != null ? "Error: " + err + "<br/>" : "") +
                "<form method=\"POST\" action=\"/login\">\n" +
                "    <input type=\"text\" name=\"username\" " +
                (username != null ? "value='" + username + "' " : "") +
                "/>\n" +
                "    <input type=\"password\" name=\"password\"/>\n" +
                "    <input type=\"submit\" value=\"login\"/>\n" +
                "</form>");
    }
}
