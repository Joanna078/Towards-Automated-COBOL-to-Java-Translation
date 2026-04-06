import java.util.Scanner;

public class ABC_100_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();

        if (s.charAt(0) == 'A') {
            int cnt = 0;
            int idx = 99;
            for (int i = 2; i < len; i++) {
                if (s.charAt(i) == 'C') {
                    cnt++;
                    idx = i;
                }
            }

            if (cnt == 1) {
                boolean flg = false;
                for (int i = 1; i < len; i++) {
                    if (i != idx) {
                        char chr = s.charAt(i);
                        if (chr < 'a' || chr > 'z') {
                            flg = true;
                            break;
                        }
                    }
                }

                if (flg) {
                    System.out.println("WA");
                } else {
                    System.out.println("AC");
                }

            } else {
                System.out.println("WA");
            }

        } else {
            System.out.println("WA");
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read input from the console.
2. **String Length Calculation**: Used `length()` method instead of `FUNCTION STORED-CHAR-LENGTH`.
3. **Character Comparison**: Used `charAt()` method to access individual characters.
4. **Looping**: Replaced `PERFORM VARYING` with traditional `for` loops.
5. **Conditional Statements**: Replaced `IF` statements with traditional `if` syntax.
6. **Boolean Flag**: Used `boolean` type instead of `PIC 9(1)` for flags.
7. **Display Output**: Replaced `DISPLAY` with `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.