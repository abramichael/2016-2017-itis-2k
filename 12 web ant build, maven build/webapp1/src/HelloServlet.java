import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException,
			IOException {

		resp.getWriter().println("Hello, guuuuuyz..");

	}

}