package servlets;

import entities.Student;
import services.StudentService;
import services.StudentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ma on 31.10.2016.
 */
@WebServlet(name = "servlets.StudentsServlet")
public class StudentsServlet extends HttpServlet {
    private StudentService studentService = new StudentServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Student> students = studentService.getAllStudents();

        request.setAttribute("students", students);
        RequestDispatcher rd = request.getRequestDispatcher("/students.jsp");
        rd.forward(request, response);


    }
}
