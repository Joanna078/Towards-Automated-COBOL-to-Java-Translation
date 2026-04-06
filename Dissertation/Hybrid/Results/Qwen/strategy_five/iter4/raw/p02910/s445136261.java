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
        int sw = 0; // 0 in COBOL is represented as 0
        String out = "Yes";
        
        for (int i = 0; i < cnt && out.equals("Yes"); i++) {
            char x = parts[i].charAt(0);
            if (!((sw == 0 && (x == 'R' || x == 'U' || x == 'D')) || (sw == 1 && (x == 'L' || x == 'U' || x == 'D')))) {
                out = "No";
            }
            sw = 1 - sw;
        }
        
        // Output
        System.out.println(out);
    }
}
```