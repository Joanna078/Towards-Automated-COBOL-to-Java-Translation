import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input handling
        String inp = scanner.nextLine();
        char[] s = inp.toCharArray();

        inp = scanner.nextLine();
        char[] t = inp.toCharArray();

        int idx = 0;
        while (idx < s.length && s[idx] != ' ') {
            idx++;
        }

        int cnt = 0;
        while (cnt < idx && !new String(s).equals(new String(t))) {
            char[] wkS = new char[s.length];
            System.arraycopy(s, 0, wkS, 0, s.length);
            wkS[idx] = s[0];
            System.arraycopy(wkS, 0, s, 0, s.length);
            cnt++;
        }

        if (new String(s).equals(new String(t))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Used `Scanner` to read input from the console.
2. **Data Structures**: Converted COBOL's fixed-length arrays into Java's character arrays (`char[]`).
3. **Looping Constructs**: Replaced COBOL's `PERFORM UNTIL` loops with Java's `while` loops.
4. **String Comparison**: Used `String.equals()` method instead of comparing character arrays directly.
5. **System Output**: Used `System.out.println()` for output instead of COBOL's `DISPLAY`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices.