import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int a1 = Integer.parseInt(line.substring(0, line.indexOf(" ")));
        line = line.substring(line.indexOf(" ") + 1);
        int a2 = Integer.parseInt(line.substring(0, line.indexOf(" ")));
        line = line.substring(line.indexOf(" ") + 1);
        int a3 = Integer.parseInt(line);
        if (a1 + a2 + a3 <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}