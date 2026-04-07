import java.util.Scanner;

public class ABC_099_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int ablen = 2;
        int cur = 1;
        char[] ab1 = new char[ablen];
        int len;
        int div;
        int s = 0;
        int t;
        int ans = 0;

        while (cur <= inp.length()) {
            int j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            System.arraycopy(inp.toCharArray(), cur - 1, ab1, 0, len);

            cur = j + 1;

            if (i < ablen) {
                i++;
            } else {
                break;
            }
        }

        div = ab1[1] - ab1[0];

        for (int k = 1; k <= div; k++) {
            s += k;
        }

        t = s - ab1[1];
        ans = t;

        System.out.println(ans);
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT INP` with `Scanner` to read input from the console.
2. **Array Initialization**: Used `char[]` instead of `PIC X(19)` to store characters.
3. **Loop Control**: Replaced COBOL loop constructs with Java's `while` loops.
4. **String Operations**: Used `System.arraycopy` for copying parts of the string.
5. **Variable Naming**: Changed variable names to follow Java naming conventions.
6. **Java 17 Features**: No specific Java 17 features were used as the original code was already quite simple.