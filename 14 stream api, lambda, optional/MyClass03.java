import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ma on 09.02.2017.
 */
public class MyClass03 {
    public static void main(String[] args) {
        int [] a = new int[]{1,23,4,5,6,2};

        int [] b = Arrays.stream(a)
                .map(x -> x * x).toArray();
        System.out.println(Arrays.toString(b));

        int c = Arrays.stream(a).
                reduce((x, y) -> x - y).orElse(0);

        System.out.println(c);

        String [] s = new String[]{"Sagit", "Leysan", "Taya"};
        String res = Arrays.stream(s)
                .reduce((x, y) -> x + ", " + y).orElse("");
        System.out.println(res);
    }
}
