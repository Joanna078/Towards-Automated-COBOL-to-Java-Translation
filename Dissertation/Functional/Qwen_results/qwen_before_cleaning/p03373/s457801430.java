import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String inp = "10 20 30 40 50"; // Example input
        int[] values = Arrays.stream(inp.split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();
        
        int a = values[0];
        int b = values[1];
        int c = values[2];
        int x = values[3];
        int y = values[4];

        int max = a * x + b * y;
        int big = x >= y ? a : b;
        int sa = x >= y ? x - y : y - x;
        int cnt = a + b <= c * 2 ? max : max - (a + b - c * 2) * Math.min(x, y);
        
        if (big > c * 2) {
            cnt -= (big - c * 2) * sa;
        }

        System.out.println(String.format("%08d", cnt));
    }
}
```

### Explanation of Changes:
1. **Data Types**: Converted COBOL data types to Java equivalents (`PIC X` to `String`, `PIC 9(4)` to `int`, etc.).
2. **Input Handling**: Used `Arrays.stream` to split the input string and convert it into an array of integers.
3. **Conditional Logic**: Translated COBOL conditional statements to Java's `if-else` constructs.
4. **Math Functions**: Replaced COBOL's `FUNCTION MIN` with Java's `Math.min`.
5. **Output Formatting**: Used `String.format` to match the output format specified in the COBOL program.
6. **Main Method**: Enclosed the logic within a `main` method to make it executable as a standalone Java application.