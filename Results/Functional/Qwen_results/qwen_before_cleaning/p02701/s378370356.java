import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input N
        int n = Integer.parseInt(scanner.nextLine());
        
        // Input array S
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }
        
        // Sort array S
        Arrays.sort(s);
        
        // Count distinct elements
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (!s[i].equals(s[i - 1])) {
                cnt++;
            }
        }
        
        // Output result
        System.out.println(cnt);
    }
}
```

### Explanation of the Code:
1. **Input Handling**: The program reads `N` and then reads `N` strings into an array `s`.
2. **Sorting**: The array `s` is sorted using `Arrays.sort()`.
3. **Counting Distinct Elements**: A loop iterates through the sorted array to count the number of distinct elements.
4. **Output**: The count of distinct elements is printed.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.