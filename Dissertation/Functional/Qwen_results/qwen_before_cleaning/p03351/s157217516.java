import java.util.Arrays;

public class ABC_097_B {
    public static void main(String[] args) {
        String inp = ""; // Input string will be set here or through user input
        int maxlen = 4;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int[] abcd = new int[maxlen];

        // Simulating ACCEPT INP
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input string:");
        inp = scanner.nextLine();

        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && inp.charAt(j - 1) != ' ') {
                j++;
            }

            len = j - cur;
            abcd[i - 1] = Integer.parseInt(inp.substring(cur - 1, j - 1));

            cur = j + 1;
            i++;
        }

        if ((abcd[0] - abcd[2] <= abcd[3]) || (abcd[1] - abcd[2] <= abcd[3])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

### Explanation of Changes:
1. **Data Types**: 
   - `INP` is converted to a `String`.
   - `maxlen`, `cur`, `i`, `j`, and `len` are converted to `int`.
   - `abcd` is converted to an array of `int`.

2. **Input Handling**:
   - The `ACCEPT INP` statement is replaced with a `Scanner` to read input from the console.

3. **Looping and Logic**:
   - The nested loops and conditions are translated into Java syntax.
   - The `PERFORM VARYING` loop is replaced with a `while` loop.
   - The `COMPUTE` statements are replaced with arithmetic operations.
   - The `MOVE` statement is replaced with `substring` and `Integer.parseInt`.

4. **Output**:
   - The `DISPLAY` statements are replaced with `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program.