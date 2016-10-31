package dao;

import entities.Student;
import helpers.DBConnectionHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ma on 31.10.2016.
 */
public class StudentDAOImpl implements StudentDAO {
    private Connection conn = DBConnectionHelper.getConnection();
    @Override
    public List<Student> getStudents() {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from students");
            List<Student> students = new ArrayList<>();
            while (rs.next()){
                Student student =
                        new Student(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getInt("year"),
                                rs.getInt("group_id")
                        );
                students.add(student);
            }
            return students;

        } catch (SQLException e) {
            return null;
        }

    }
}
