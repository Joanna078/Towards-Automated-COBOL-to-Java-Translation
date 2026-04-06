import java.util.Scanner;

public class ABC_074_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();

        // Working storage
        int maxlen = n;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        StringBuilder ans = new StringBuilder();
        int x;
        int sm = 0;
        String zs = "";
        char dummy;

        while (i <= maxlen) {
            j = cur;
            while (j <= maxlen && inp.charAt(j - 1) != ' ') {
                j++;
            }

            len = j - cur;
            x = Character.getNumericValue(inp.charAt(cur - 1));

            x = Math.min(x, k - x);
            sm += 2 * x;

            cur = j + 1;
            i++;
        }

        zs = String.format("%06d", sm);

        unans(zs, ans);

        System.out.println(ans.toString().trim());
    }

    private static void unans(String zs, StringBuilder ans) {
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` statements with Java's `Scanner` to read input from the console.
2. **Data Types**: Converted COBOL data types to their Java equivalents (`int`, `String`, etc.).
3. **Looping**: Used Java's `while` loop instead of COBOL's `PERFORM` loops.
4. **String Manipulation**: Used Java's `StringBuilder` for string manipulation, which is more efficient than concatenating strings in a loop.
5. **Math Functions**: Used Java's `Math.min` function instead of COBOL's `FUNCTION MIN`.
6. **Formatting**: Used `String.format` to format integers as strings with leading zeros.
7. **Comments**: Added comments to explain complex logic sections.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and syntax.