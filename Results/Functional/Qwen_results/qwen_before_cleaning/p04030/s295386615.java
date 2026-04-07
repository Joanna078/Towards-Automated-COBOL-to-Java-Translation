import java.util.Arrays;

public class ABC_043_B {
    public static void main(String[] args) {
        // Working storage section
        char[] s1 = new char[10];
        char[] ans1 = new char[10];
        int i;
        int len;
        int now = 0;

        // Accept input
        System.out.println("Enter string of length up to 10 characters:");
        String input = System.console().readLine();
        if (input.length() > 10) {
            throw new IllegalArgumentException("Input length must be up to 10 characters");
        }
        input.getChars(0, input.length(), s1, 0);

        // Compute length
        len = input.length();

        // Process the string
        for (i = 0; i < len; i++) {
            if (s1[i] == 'B') {
                if (now != 0) {
                    ans1[now - 1] = ' ';
                    now--;
                }
            } else {
                ans1[now++] = s1[i];
            }
        }

        // Display output
        System.out.println(new String(Arrays.copyOfRange(ans1, 0, now)));
    }
}
```

### Explanation of Changes:
1. **Data Structure**: Replaced COBOL's OCCURS with Java arrays.
2. **String Handling**: Used `System.console().readLine()` to read input from the console and handled the length check.
3. **Looping**: Replaced COBOL's `PERFORM` loop with a traditional `for` loop in Java.
4. **Conditional Logic**: Kept the conditional logic intact but used Java syntax.
5. **Display Output**: Used `System.out.println` to display the result, converting the array to a string using `Arrays.copyOfRange`.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and features.