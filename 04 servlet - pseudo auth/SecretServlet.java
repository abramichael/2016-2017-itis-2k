import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ma on 28.09.2016.
 */
public class SecretServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("current_user") != null) {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            pw.println("Secret text. Hello, " + request.getSession().getAttribute("current_user"));
            pw.println("<a href='/guest'>Guest</a>");
            pw.close();
        }
        else {
            response.sendRedirect("/login");
        }
    }
}
