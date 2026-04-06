import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int a = Integer.parseInt(line.substring(0, 3).trim());
        int b = Integer.parseInt(line.substring(3, 4).trim());
        int c = Integer.parseInt(line.substring(4, 7).trim());
        if (a <= c && c <= a + b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}