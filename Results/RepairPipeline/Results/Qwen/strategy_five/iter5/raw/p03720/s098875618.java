```java
import java.util.Arrays;

public class ABC_061_B {
    public static void main(String[] args) {
        // Working storage variables
        String inp = ""; // Replace with actual input
        int n;
        int m;
        String inp2;
        long i;
        int len;
        int a;
        int b;
        int[] town = new int[50];
        String ans = "";
        int zs;
        char dummy;

        // Input processing
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        n = Integer.parseInt(parts[0]);
        m = Integer.parseInt(parts[1]);

        // Loop to process input2
        for (i = 1; i <= m; i++) {
            inp2 = scanner.nextLine();
            parts = inp2.split(" ");
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);

            town[a - 1]++;
            town[b - 1]++;
        }

        // Loop to prepare answer
        for (i = 1; i <= n; i++) {
            zs = town[(int) i - 1];
            ans += String.format("%d", zs); // Remove space to match COBOL output
        }

        // Output processing
        System.out.println(ans.trim());
        scanner.close();
    }
}
```