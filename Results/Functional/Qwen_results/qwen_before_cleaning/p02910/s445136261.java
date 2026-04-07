import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter string S:");
        String s = scanner.nextLine();
        
        // Process
        String[] parts = s.split(" ");
        int cnt = parts.length;
        boolean sw = false; // 0 in COBOL is represented as false
        String out = "Yes";
        
        for (int i = 0; i < cnt && out.equals("Yes"); i++) {
            char x = parts[i].charAt(0);
            if (!((sw && (x == 'R' || x == 'U' || x == 'D')) || (!sw && (x == 'L' || x == 'U' || x == 'D')))) {
                out = "No";
            }
            sw = !sw;
        }
        
        // Output
        System.out.println(out);
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input.
2. **String Splitting**: Used `split(" ")` to split the input string into parts.
3. **Boolean Logic**: Replaced `PIC 9(1)` and `MOVE 0`/`MOVE 1` with `boolean` type and `false`/`true`.
4. **Looping**: Replaced `PERFORM VARYING` with a traditional `for` loop.
5. **Conditional Checks**: Simplified conditional checks using `&&` and `||`.
6. **Output**: Replaced `DISPLAY` with `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.