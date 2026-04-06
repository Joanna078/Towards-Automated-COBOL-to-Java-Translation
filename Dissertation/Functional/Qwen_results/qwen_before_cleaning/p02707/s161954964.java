import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input
        int n = Integer.parseInt(System.console().readLine());

        // Data structures
        char[] inp = System.console().readLine().toCharArray();
        int[] tbl = new int[100000];
        Arrays.fill(tbl, 0);

        // Logic
        int p1 = 0;
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < n && inp[p2] != ' ') {
                p2++;
            }
            String w = new String(inp, p1, p2 - p1);
            tbl[w.length()]++;
            p1 = p2 + 1;
        }

        // Output
        for (int i = 1; i <= n; i++) {
            System.out.println(tbl[i]);
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with `System.console().readLine()` to read input from the console.
2. **Data Structures**: The COBOL `PIC X(700000)` array is replaced with a `char[]` array in Java. The `TBL` array is replaced with an `int[]` array initialized with zeros using `Arrays.fill()`.
3. **Logic**:
   - The nested loops in COBOL are translated into Java loops.
   - The string slicing in COBOL (`INP(P1:P2 - P1)`) is replaced with `new String(inp, p1, p2 - p1)` in Java.
4. **Output**: The COBOL `DISPLAY` statement is replaced with `System.out.println()` in Java.

This Java code maintains the same logic and behavior as the original COBOL program.