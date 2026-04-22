import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String input = reader.readLine();
        char[] table = input.toCharArray();
        int count = 0;
        for (char c : table) {
            if (c == 'W') {
                count++;
            }
        }
        System.out.println(count);
    }
}
