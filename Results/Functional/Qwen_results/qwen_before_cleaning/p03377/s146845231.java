import java.util.Scanner;

public class ABC_094_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        long[] abx = new long[3];

        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            abx[i - 1] = Long.parseLong(inp.substring(cur - 1, j));

            cur = j + 1;
            i++;
        }

        if (abx[0] <= abx[2] && abx[2] <= abx[0] + abx[1]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT INP` with `Scanner` to read input from the console.
2. **Array Initialization**: Used a `long` array `abx` instead of a custom structure to store the values.
3. **String Operations**: Replaced COBOL string operations with Java's `substring` method.
4. **Looping**: Replaced COBOL loops with Java's `while` loop.
5. **Comparison**: Used Java's comparison operators directly.
6. **Output**: Replaced `DISPLAY` with `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program.