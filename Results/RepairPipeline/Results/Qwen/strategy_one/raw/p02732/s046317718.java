```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        
        // Initialize arrays
        int[] c = new int[26]; // Assuming only lowercase letters
        char[] a = new char[n + 1];
        
        // Initialize counters
        Arrays.fill(c, 0);
        
        // Process input
        int p1 = 0;
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < input.length() && input.charAt(p2) != ' ') {
                p2++;
            }
            a[i] = input.substring(p1, p2).charAt(0);
            c[a[i] - 'a']++;
            p1 = p2 + 1;
        }
        
        // Calculate and display results
        for (int i = 1; i <= n; i++) {
            long cnt = 0;
            for (int j = 0; j < 26; j++) {
                if (c[j] > 1) {
                    cnt += (long) c[j] * (c[j] - 1) / 2;
                }
            }
            System.out.printf("%d%n", cnt);
        }
        
        scanner.close();
    }
}
```