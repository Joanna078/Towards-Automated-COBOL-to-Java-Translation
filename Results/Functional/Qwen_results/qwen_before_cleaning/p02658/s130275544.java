import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from keyboard
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        
        long inf = 1000000000000000000L;
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        long ans = 1;
        char[] zs = new char[36];
        int flg = 0;
        int[] a = new int[100000];

        // Process input
        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && input.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            a[i] = Integer.parseInt(input.substring(cur - 1, j - 1));
            if (a[i] == 0) {
                flg = 1;
                break;
            }
            cur = j + 1;
            i++;
        }

        if (flg == 1) {
            System.out.println("ZERO");
        } else {
            for (; i <= maxlen; i++) {
                if ((long) a[i] > inf) {
                    flg = 1;
                    break;
                }
                ans *= a[i];
                if ((long) ans > inf) {
                    flg = 1;
                    break;
                }
            }
            if (flg == 1) {
                System.out.println("-1");
            } else {
                System.out.println(String.format("%d", ans).trim());
            }
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` with Java's `Scanner` to read input from the console.
2. **Data Types**: Converted COBOL data types to their Java equivalents (`PIC X` to `String`, `PIC 9` to `int`, etc.).
3. **Looping Constructs**: Used Java's `while` loops instead of COBOL's `PERFORM`.
4. **String Operations**: Used Java's string methods like `substring` and `trim` instead of COBOL's string functions.
5. **Array Initialization**: Initialized arrays using Java syntax.
6. **Conditional Statements**: Used Java's `if-else` statements instead of COBOL's `IF-THEN-ELSE`.

This Java code maintains the same functionality as the original COBOL program.