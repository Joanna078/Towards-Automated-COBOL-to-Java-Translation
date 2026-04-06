public class ABC_104_A {
    public static void main(String[] args) {
        // Input from user or predefined value
        int r = Integer.parseInt(args[0]); // Assuming input is provided as command-line argument

        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}
```

### Explanation of Changes:
1. **Class Definition**: The COBOL program is converted into a Java class named `ABC_104_A`.
2. **Main Method**: The `main` method serves as the entry point for the Java application.
3. **Input Handling**: The input `R` is read from the command line arguments using `Integer.parseInt(args[0])`. This assumes that the input will be provided when running the program.
4. **Conditional Statements**: The conditional logic remains the same but uses Java's `if-else` structure.
5. **Output**: The `DISPLAY` statement in COBOL is replaced with `System.out.println()` in Java.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.