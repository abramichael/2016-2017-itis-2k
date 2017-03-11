import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by ma on 08.02.2017.
 */
public class MyClass01 {
    public static void main(String[] args) {
        Optional<String> value = Optional.ofNullable("Man");
        System.out.println("Hi, " + value);
        //System.out.println("Hi, " + value.get());
        String s = "HAHA";
        System.out.println("Hi, " + value.orElseGet(() -> s));
        System.out.println(value.map(x -> "Oh, " + x).orElse("Hi, anon"));


    }
}
