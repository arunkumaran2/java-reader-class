import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferedReader {
    public static void main(String[] arg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("ENTER YOUR NAME");
            String name = reader.readLine();
            System.out.println("Name=" + name);
        } catch (Exception var4) {
        }

    }
}
