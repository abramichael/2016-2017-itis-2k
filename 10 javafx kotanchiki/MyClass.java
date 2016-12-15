package sample;

/**
 * @author Oleg Shatin
 *         11-501
 */
interface I {
    int f(int x, int y);
}

public class MyClass {
    public static void main(String[] args) {
        I o = new I() {
            @Override
            public int f(int x, int y) {
                return x + y;
            }
        };

        I o2 = (int x, int y) -> {
            return x + y;
        };
    }


}
