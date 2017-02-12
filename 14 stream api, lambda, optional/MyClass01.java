public class MyClass01 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("I'm thread");
        });
        t.start();
    }
}
