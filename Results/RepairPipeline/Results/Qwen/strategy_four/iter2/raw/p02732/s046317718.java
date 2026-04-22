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
        int[] c = new int[200001]; // Adjusted size to match COBOL array size
        int[] a = new int[200001]; // Adjusted size to match COBOL array size
        
        // Initialize counters
        Arrays.fill(c, 0);
        
        // Process input
        int p1 = 0;
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < input.length() && input.charAt(p2) != ' ') {
                p2++;
            }
            if (p2 > p1) {
                a[i] = Integer.parseInt(input.substring(p1, p2));
                c[a[i]]++;
            }
            p1 = p2 + 1;
        }
        
        // Calculate and display results
        for (int i = 1; i <= n; i++) {
            long cnt = 0;
            for (int j = 1; j <= n; j++) { // Corrected loop limit to match the number of unique elements
                if (c[j] > 1) {
                    if (a[i] == j) {
                        cnt += (long) (c[j] - 1) * c[j] / 2;
                    } else {
                        cnt += (long) c[j] * (c[j] - 1) / 2;
                    }
                }
            }
            System.out.printf("%d%n", cnt);
        }
        
        scanner.close();
    }
}
```