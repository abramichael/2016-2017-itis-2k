import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ma on 09.02.2017.
 */
public class MyClass02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", 1996));
        students.add(new Student("Amir", 1997));
        students.add(new Student("Natasha", 1997));
        students.add(new Student("Marat", 1997));
        students.add(new Student("Bogdan", 1998));
        students.add(new Student("Anton", 1998));

        int yearNeeded = 1998;
        List<Student> result = students
                .stream()
                .filter(s -> s.getYear() == yearNeeded)
                .collect(Collectors.toList());
        System.out.println(result);

        Map<Integer, List<Student>> mapOfYears = students
                .stream()
                .collect(Collectors.groupingBy(Student::getYear));
        System.out.println(mapOfYears);

        double averageYear = students
                .stream()
                .mapToInt(x -> x.getYear())
                .average()
                .orElse(0);


    }
}
