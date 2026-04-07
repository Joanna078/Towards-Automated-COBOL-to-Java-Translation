import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int len = input.length();
        int i;
        int j;
        for (i = 0; i < len; i++) {
            if (input.charAt(i) == 'A') {
                break;
            }
        }
        for (j = len - 1; j >= 0; j--) {
            if (input.charAt(j) == 'Z') {
                break;
            }
        }
        int diff = j - i;
        StringBuilder sb = new StringBuilder();
        sb.append(diff + 1);
        System.out.println(sb.toString());
    }
}