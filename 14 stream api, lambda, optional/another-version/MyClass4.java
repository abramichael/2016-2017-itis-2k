import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ma on 09.02.2017.
 */
public class MyClass4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Michael", 1994));
        students.add(new Student("Michael2", 1993));
        students.add(new Student("Michael3", 1994));
        students.add(new Student("Michael4", 1994));

        final Map<Integer, List<Student>> map = students.stream()
                .collect(Collectors.groupingBy(Student::getYear));
        System.out.println(map);

        final int lst = students
                .stream()
                .mapToInt(Student::getYear)
                .reduce((s1,s2) -> s1 + s2)
                .orElse(0);
        System.out.println(lst);

    }
}
