import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input values
        int n = Integer.parseInt(System.console().readLine());
        String inp = System.console().readLine();

        // Working storage variables
        int wa = 0;
        int p1 = 1;
        int[] tw = new int[100];
        int i, s1, s2, p2;

        // Process each word in the input string
        for (i = 1; i <= n; i++) {
            p2 = p1;
            while (p2 <= n && inp.charAt(p2 - 1) != ' ') {
                p2++;
            }
            int w = Integer.parseInt(inp.substring(p1 - 1, p2 - 1));
            wa += w;
            tw[i - 1] = wa;
            p1 = p2 + 1;
        }

        // Calculate half of the total sum
        double hf = (double) wa / 2;

        // Find the first index where the cumulative sum is greater than or equal to half
        for (i = 0; i < n && tw[i] < hf; i++);

        // Determine the output based on conditions
        if (tw[i] == hf) {
            System.out.println("0");
        } else {
            s1 = wa - tw[i] * 2;
            s2 = i > 0 ? wa - tw[i - 1] * 2 : wa - tw[i] * 2;
            System.out.println(s1 < s2 ? s1 : s2);
        }
    }
}
```

### Explanation of the Conversion:
1. **Data Division**: The COBOL data division is translated into Java variables with appropriate types (`int`, `String`, etc.).
2. **Procedure Division**:
   - **ACCEPT**: Replaced with `System.console().readLine()` to read input from the console.
   - **MOVE**: Replaced with assignment statements (`=`).
   - **PERFORM VARYING**: Translated into traditional `for` loops.
   - **COMPUTE**: Replaced with arithmetic operations.
   - **DISPLAY**: Replaced with `System.out.println()`.
   - **STOP RUN**: Replaced with `return` or `exit`.

This Java code maintains the original logic and behavior of the provided COBOL program.