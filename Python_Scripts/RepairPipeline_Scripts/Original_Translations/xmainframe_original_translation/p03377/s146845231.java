import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int a = Integer.parseInt(line.substring(0, 3));
        int b = Integer.parseInt(line.substring(4, 5));
        int c = Integer.parseInt(line.substring(6, 9));
        if (a <= c && c <= a + b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
