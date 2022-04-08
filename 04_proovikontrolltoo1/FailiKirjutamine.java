import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FailiKirjutamine {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(
                new FileWriter("väljund1.txt")
        );
        pw.println("tere");
        pw.print("Juku");
        pw.print("Kuku");
        pw.close();
    }
}
