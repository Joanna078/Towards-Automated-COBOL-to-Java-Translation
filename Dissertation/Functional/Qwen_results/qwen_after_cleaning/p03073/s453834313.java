import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // WORKING-STORAGE SECTION
        char[] s = new char[100001];
        int[] c = {0, 0};
        int f = 1;
        int a, h, k1, k2, i;
        StringBuilder out = new StringBuilder();

        // ACCEPT S FROM SYSIN.
        Scanner scanner = new Scanner(System.in);
        scanner.next(s);

        // PERFORM VARYING I FROM 1 BY 1 UNTIL S(I:1) = ' '
        for (i = 0; i < s.length && s[i] != ' '; i++) {
            if (s[i] == '1') {
                c[f] += 1;
            }
            f = 3 - f;
        }

        // SUBTRACT 1 FROM I
        i -= 1;

        // DIVIDE I BY 2 GIVING H REMAINDER A
        h = i / 2;
        a = i % 2;

        // COMPUTE K1 AND K2
        k1 = h + a - c[0] + c[1];
        k2 = h - c[1] + c[0];

        // IF (K1 < K2)
        if (k1 < k2) {
            out.append(k1);
        } else {
            out.append(k2);
        }

        // DISPLAY FUNCTION TRIM(OUT)
        System.out.println(out.toString());
    }
}