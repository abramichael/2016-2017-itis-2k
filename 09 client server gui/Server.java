import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ma on 16.11.2016.
 */
public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(3456);
        Socket s = ss.accept();
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        while (true) {
            pw.println("Hello");
            Thread.sleep(3000);
        }

    }
}
