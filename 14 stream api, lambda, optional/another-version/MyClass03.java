import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by ma on 09.02.2017.
 */
public class MyClass03 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Damir");
        students.add("Kate");
        students.add("Marat");
        students.add("Bogdan");

        Stream<String> stream = students.stream();

        System.out.println(Arrays.toString(stream.filter(x -> x.length() == 5).toArray()));
        stream = students.stream();
        System.out.println(Arrays.toString(stream.mapToInt(String::length).toArray()));
        stream = students.stream();
        System.out.println(stream.mapToInt(String::length).count());

    }
}
