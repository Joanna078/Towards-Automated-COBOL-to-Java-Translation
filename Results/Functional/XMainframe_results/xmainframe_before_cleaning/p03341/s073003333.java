import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        int wCount = 0;
        int eCount = 0;
        int min = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'W') {
                wCount++;
            } else {
                eCount++;
            }
            int diff = wCount - eCount;
            if (min > diff) {
                min = diff;
            }
        }
        System.out.println(Math.abs(min));
    }
}