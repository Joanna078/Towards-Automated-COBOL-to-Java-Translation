import java.util.Scanner;

public class ABC_048_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly three space-separated values.");
        }

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int x = Integer.parseInt(parts[2]);

        int q1 = a / x;
        int r = a % x;
        int q2 = b / x;

        if (r == 0) {
            q2++;
        }

        StringBuilder zs = new StringBuilder(Integer.toString(q2));
        while (zs.indexOf(" ") != -1) {
            zs.deleteCharAt(zs.indexOf(" "));
        }

        String ans = zs.toString();
        System.out.println(ans);
    }
}
```

### Explanation of Changes:
1. **Data Types**: Replaced COBOL data types with appropriate Java data types (`int` for numeric values and `String` for character strings).
2. **Input Handling**: Used `Scanner` to read input from the console.
3. **String Splitting**: Used `split` method to split the input string into parts.
4. **Arithmetic Operations**: Used standard arithmetic operators (`/`, `%`) instead of COBOL's `DIVIDE`.
5. **String Manipulation**: Used `StringBuilder` to remove spaces from the result string.
6. **Output**: Used `System.out.println` to display the result.

This Java code maintains the same logic and behavior as the original COBOL program.