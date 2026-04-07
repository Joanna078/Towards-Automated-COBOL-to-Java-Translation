import java.util.Arrays;

public class AisingC {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // Assuming input is passed as command line argument
        int[] tbl = new int[10001]; // Array to store counts, initialized to zero by default

        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int v = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (v <= 10000) {
                        tbl[v]++;
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf("%02d\n", tbl[i]);
        }
    }
}
```

### Explanation of Changes:
1. **Data Types**: 
   - `PIC 9(05) COMP` is converted to `int`.
   - `PIC 9(04) COMP` is converted to `int`.
   - `PIC 9(09) COMP` is converted to `int`.
   - `OCCURS 10000` is replaced with a fixed-size array `tbl`.

2. **Initialization**:
   - The `MOVE ZERO TO TBL` statement is replaced with initializing the array `tbl` directly.

3. **Looping**:
   - The `PERFORM VARYING` statements are replaced with traditional `for` loops in Java.

4. **Conditionals**:
   - The `IF V <= 10000` condition remains unchanged.

5. **Output**:
   - The `DISPLAY FUNCTION TRIM(OUT)` statement is replaced with `System.out.printf` to format the output correctly.

6. **Main Method**:
   - The `main` method reads the input from command line arguments and processes it accordingly.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards and best practices.