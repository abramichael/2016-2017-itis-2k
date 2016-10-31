package services;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import entities.Student;

import java.util.List;

/**
 * Created by ma on 31.10.2016.
 */
public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getStudents();
    }
}
