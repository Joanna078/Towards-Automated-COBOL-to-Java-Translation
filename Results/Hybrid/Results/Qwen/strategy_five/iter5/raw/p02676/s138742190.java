```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept K
        int k = Integer.parseInt(scanner.nextLine().trim());

        // Accept S
        String s = scanner.nextLine().trim();

        // Split S into words and count them
        String[] words = s.split(" ");
        int len = words.length;

        if (len <= k) {
            // Display trimmed S
            System.out.println(s.trim());
        } else {
            // Display first K characters followed by "..."
            StringBuilder result = new StringBuilder();
            int charCount = 0;
            for (int i = 0; i < words.length; i++) {
                if (charCount + words[i].length() > k) {
                    break;
                }
                result.append(words[i]);
                charCount += words[i].length();
                if (i < words.length - 1 && charCount < k) {
                    result.append(" ");
                }
            }
            if (charCount < s.length()) {
                result.append("...");
            }
            System.out.println(result.toString());
        }

        scanner.close();
    }
}
```