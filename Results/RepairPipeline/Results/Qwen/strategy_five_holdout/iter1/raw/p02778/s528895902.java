```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input handling
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        // Processing
        int cnt = 0;
        StringBuilder s = new StringBuilder();
        for (char c : inp.toCharArray()) {
            if (c == ' ') break;
            s.append('x');
            cnt++;
        }

        // Output
        System.out.print(s.toString());
    }
}
```