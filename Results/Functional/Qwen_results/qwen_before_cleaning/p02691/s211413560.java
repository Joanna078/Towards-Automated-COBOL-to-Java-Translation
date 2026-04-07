import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input from user
        int n = Integer.parseInt(System.console().readLine());

        // Initialize arrays
        char[] inp = new char[2_200_000];
        Arrays.fill(inp, ' ');
        int[] tbl1 = new int[200_000];
        int[] tbl2 = new int[200_000];
        int p1 = 1;
        int p2 = 1;
        int i = 1;
        long cnt = 0;
        StringBuilder out = new StringBuilder();

        // Read input string
        System.in.read(inp);

        // Process input
        while (i <= n) {
            while (p2 <= n && inp[p2 - 1] != ' ') {
                p2++;
            }
            String subStr = new String(Arrays.copyOfRange(inp, p1 - 1, p2 - 1));
            int len = subStr.length();
            if (i > len) {
                tbl2[i - len]++;
            }
            p1 = p2 + 1;
            i++;
        }

        // Calculate result
        i = 1;
        while (i <= n - 2) {
            if (i + tbl1[i] <= n) {
                cnt += tbl2[i + tbl1[i]];
            }
            i++;
        }

        // Output result
        out.append(cnt);
        System.out.println(out.toString());
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with `System.console().readLine()` to read input from the console.
2. **Array Initialization**: Arrays are initialized using `new` keyword and filled with default values where necessary.
3. **String Operations**: Substring operations are performed using `Arrays.copyOfRange` and `new String`.
4. **Looping and Conditionals**: Loops and conditionals are translated directly into Java syntax.
5. **Output**: The result is appended to a `StringBuilder` and then printed to the console.

This Java code maintains the logic and behavior of the original COBOL program while adhering to Java 17 standards and best practices.