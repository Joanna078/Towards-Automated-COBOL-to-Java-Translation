```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rcnt = 0;
        int bcnt = 0;
        int len = input.length() - 1; // Initialize len to the last index of the input string
        int ans = 0;
        int idx = 0;

        while (idx < input.length()) {
            char sa = input.charAt(idx);
            if (sa == '0') {
                rcnt++;
            } else if (sa == '1') {
                bcnt++;
            } else if (sa == ' ') {
                len = idx - 1; // Adjust len to be the index of the last non-space character
                break;
            }
            idx++;
        }

        if (rcnt > bcnt) {
            ans = len - (rcnt - bcnt);
        } else {
            ans = len - (bcnt - rcnt);
        }

        System.out.printf("%05d%n", ans);
    }
}
```