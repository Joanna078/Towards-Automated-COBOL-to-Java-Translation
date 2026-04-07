public class ProgramId {
    public static void main(String[] args) {
        // Input from user or predefined value
        int n = Integer.parseInt(args[0]); // Assuming input is provided as command-line argument

        // Compute the result
        double ans = (double) n / 2 + 0.9;

        // Output the result
        System.out.println(ans);
    }
}
```

### Explanation of Changes:
1. **Data Division**: The `WORKING-STORAGE` section in COBOL has been replaced with Java's primitive data types (`int` and `double`).
2. **Procedure Division**:
   - `ACCEPT N` is replaced with reading the input from the command line using `Integer.parseInt(args[0])`.
   - `COMPUTE ans = N / 2 + 0.9` is translated directly into Java.
   - `DISPLAY ans` is replaced with `System.out.println(ans)` to output the result.
3. **Java 17 Features**: No specific Java 17 features were used in this simple example, but you could use them if needed (e.g., switch expressions, records, etc.).

This Java code maintains the same logic and behavior as the original COBOL program.