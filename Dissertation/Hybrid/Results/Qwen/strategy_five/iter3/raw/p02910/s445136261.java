```java
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

Note: The provided Java code is already correct and should not produce the error described. If the error persists, it may be due to an issue outside of the code snippet provided, such as input handling or environment-specific issues.