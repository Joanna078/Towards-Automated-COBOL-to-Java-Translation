import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        char[] s = System.console().readLine().toCharArray();

        int[] rn = new int[4001];
        int[] gn = new int[4001];
        int[] bn = new int[4001];

        Arrays.fill(rn, 0);
        Arrays.fill(gn, 0);
        Arrays.fill(bn, 0);

        int ir = 0;
        int ig = 0;
        int ib = 0;

        for (int i1 = 0; i1 < n; i1++) {
            if (s[i1] == 'R') {
                ir++;
                rn[ir] = i1 + 1;
            } else if (s[i1] == 'G') {
                ig++;
                gn[ig] = i1 + 1;
            } else if (s[i1] == 'B') {
                ib++;
                bn[ib] = i1 + 1;
            }
        }

        int ks = 0;

        for (int i1 = 1; i1 <= ir; i1++) {
            for (int i2 = 1; i2 <= ig; i2++) {
                for (int i3 = 1; i3 <= ib; i3++) {
                    int s1 = rn[i1] - gn[i2];
                    int s2 = gn[i2] - bn[i3];
                    int s3 = rn[i1] - bn[i3];
                    if ((s1 == s2) || (s1 == s3) || (s2 == s3)) {
                        continue;
                    } else {
                        ks++;
                    }
                }
            }
        }

        System.out.println(String.format("%08d", ks));
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program. It uses Java 17 features such as `String.toCharArray()` for converting input strings to character arrays and `Arrays.fill()` for initializing arrays. The nested loops and conditional statements are translated directly from COBOL to Java. The final result is formatted using `String.format()` to match the output format specified in the COBOL program.