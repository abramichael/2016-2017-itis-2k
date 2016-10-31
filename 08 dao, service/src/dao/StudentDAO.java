package dao;

import entities.Student;

import java.util.List;

/**
 * Created by ma on 31.10.2016.
 */
public interface StudentDAO {
    List<Student> getStudents();
}
