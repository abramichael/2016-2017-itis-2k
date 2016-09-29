import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ma on 28.09.2016.
 */
public class SecretServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("current_user") != null) {
            Template tmpl = ConfigSingleton.getConfig(
                    request.getServletContext()
            ).getTemplate("secret.ftl");
            Map<String, Object> root = new HashMap<>();

            List<String> greetings = new ArrayList<>();
            greetings.add("hello");
            greetings.add("bonjour");
            greetings.add("jambo");
            greetings.add("salam");
            root.put("username", request.getSession().getAttribute("current_user"));
            root.put("greetings", greetings);
            try {
                tmpl.process(root, response.getWriter());
            } catch (TemplateException e) {
                e.printStackTrace();
            }
        }
        else {
            response.sendRedirect("/login");
        }
    }
}
