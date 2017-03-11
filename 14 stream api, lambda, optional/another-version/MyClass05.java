/**
 * Created by ma on 09.02.2017.
 */
public class MyClass05 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {System.out.println(1); System.out.println(2);});
        t.start();
    }
}
