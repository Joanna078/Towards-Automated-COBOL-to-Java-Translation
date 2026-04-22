import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int n = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int ren = 0;
        int re = 0;

        // Find the first space
        for (temp1 = 1; temp1 <= inp.length(); temp1++) {
            if (inp.charAt(temp1 - 1) == ' ') {
                break;
            }
        }
        a = Integer.parseInt(inp.substring(0, temp1));

        // Find the second space
        temp2 = temp1 + 2;
        for (; temp2 <= inp.length(); temp2++) {
            if (inp.charAt(temp2 - 1) == ' ') {
                break;
            }
        }
        n = temp2 - temp1;
        b = Integer.parseInt(inp.substring(temp1, temp1 + n));

        // Find the end of the input
        temp1 = temp2 + 1;
        for (; temp1 <= inp.length(); temp1++) {
            if (inp.charAt(temp1 - 1) == ' ') {
                break;
            }
        }
        n = temp1 - temp2;
        c = Integer.parseInt(inp.substring(temp2, temp2 + n));

        a++;
        ren = 0;

        for (int i = 1; i <= a; i++) {
            mod(i, b, c);
            if (temp1 >= b && temp1 <= c) {
                ren += i;
            }
        }

        re = ren;
        System.out.println(re);
    }

    public static void mod(int temp2, int b, int c) {
        int temp1 = 0;
        int temp3 = 0;
        for (int i = 0; i < 5; i++) {
            temp3 = temp2 / 10;
            temp1 = temp1 + temp2 - temp3 * 10;
            temp2 = temp3;
        }
    }
}