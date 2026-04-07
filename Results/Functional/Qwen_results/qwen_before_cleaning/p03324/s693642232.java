import java.util.Scanner;

public class ABC_100_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        long ans = 0;
        long[][] DN = new long[maxlen][1];

        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            DN[0][i - 1] = Long.parseLong(inp.substring(cur - 1, j));

            cur = j + 1;
            i++;
        }

        long tmp = (long) Math.pow(100, DN[0][0]) * DN[0][1];
        ans = tmp;

        System.out.println(ans);
    }
}
```

### Explanation of Complex Logic:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with a `Scanner` to read input from the console.
2. **Loop Structure**: The nested loops in COBOL are translated into a `while` loop in Java.
3. **String Slicing**: The COBOL `INP(cur:len)` is replaced with `inp.substring(cur - 1, j)` to extract substrings.
4. **Power Calculation**: The COBOL `100 ** DN(1) * DN(2)` is translated using `Math.pow`.
5. **Output**: The COBOL `DISPLAY` statement is replaced with `System.out.println`.

This Java code maintains the same functionality as the original COBOL program.