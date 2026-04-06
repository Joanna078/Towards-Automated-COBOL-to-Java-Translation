import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(reader.readLine());
        String line;
        int a, b, c;
        long now1 = 0, now2 = 0, now3 = 0;
        boolean possible = true;
        for (int i = 0; i < s; i++) {
            line = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line);
            a = Integer.parseInt(tokenizer.nextToken());
            b = Integer.parseInt(tokenizer.nextToken());
            c = Integer.parseInt(tokenizer.nextToken());
            if ((a - now1) < (b - now2)) {
                possible = false;
                break;
            }
            long temp1 = a - now1;
            long temp2 = b - now2;
            long temp3 = c - now3;
            long temp4 = temp2 + temp3;
            if (temp1 < temp4) {
                possible = false;
                break;
            }
            temp2 = temp1 / 2;
            temp1 = temp1 - temp2 * 2;
            temp2 = b - now2;
            temp3 = temp2 / 2;
            temp2 = temp2 - temp3 * 2;
            temp3 = c - now3;
            temp4 = temp3 / 2;
            temp3 = temp3 - temp4 * 2;
            temp2 = temp2 + temp3;
            temp2 = temp2 - 2;
            if (temp2 == 2) {
                temp2 = 0;
            }
            if (temp1 != temp2) {
                possible = false;
                break;
            }
            now1 = a;
            now2 = b;
            now3 = c;
        }
        System.out.println(possible ? "Yes" : "No");
    }
}