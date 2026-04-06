```java
import java.util.Scanner;

public class ProgramId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input line
        String ln = scanner.nextLine();
        
        // Split input into H and N
        String[] parts = ln.split(" ");
        int h = Integer.parseInt(parts[0].trim());
        int n = Integer.parseInt(parts[1].trim());
        
        // Initialize variables
        int maxlen = 100000;
        int cur = 1;
        long accum = 0;
        
        // Read next line from input
        ln = scanner.nextLine();
        
        // Process each character in the line
        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j <= ln.length() && ln.charAt(j - 1) != ' ') {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                int a = Integer.parseInt(ln.substring(cur - 1, j).trim());
                accum += a;
            }
            cur = j + 1;
        }
        
        // Compare H with accumulated value
        if (h <= accum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```