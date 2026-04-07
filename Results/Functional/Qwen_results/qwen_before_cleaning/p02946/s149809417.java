import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        int k = Integer.parseInt(ln.split(" ")[1]);
        int x = Integer.parseInt(ln.split(" ")[2]);
        int i = x - k + 1;
        int nl = 0;
        int sp = 0;
        int st = x - k + 1;
        int ed = x + k - 1;
        StringBuilder ans = new StringBuilder();

        if (k == 1) {
            nl = 1;
            display(i, sp, nl, ans);
            System.exit(0);
        } else {
            display(i, sp, nl, ans);
        }

        sp = 1;
        st++;
        while (ed >= st) {
            display(i, sp, nl, ans);
            st++;
        }

        nl = 1;
        display(i, sp, nl, ans);

        System.out.println(ans.toString());
    }

    private static void display(int i, int sp, int nl, StringBuilder ans) {
        if (sp != 0) {
            ans.append(' ');
        }
        if (i != 0) {
            if (nl != 0) {
                ans.append(String.format("%d", i));
            } else {
                ans.append(String.format("%d", i)).append(' ');
            }
        } else {
            if (nl != 0) {
                ans.append("0");
            } else {
                ans.append("0").append(' ');
            }
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The `Scanner` class is used to read input from the console.
2. **Data Types**: All variables are converted to appropriate Java data types (`int` for integers and `StringBuilder` for string manipulation).
3. **String Splitting**: The `split` method is used to split the input string into parts based on spaces.
4. **Looping**: A `while` loop is used instead of a `PERFORM VARYING` statement.
5. **Conditional Statements**: Java's conditional statements (`if`, `else`) are used instead of COBOL's `IF`, `ELSE`.
6. **String Formatting**: The `String.format` method is used to format strings.
7. **StringBuilder**: A `StringBuilder` is used to build the output string efficiently.
8. **Exit**: `System.exit(0)` is used to stop the program when necessary.

This Java code maintains the same logic and behavior as the original COBOL program.