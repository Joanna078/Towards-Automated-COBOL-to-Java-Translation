import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input size
        int n = Integer.parseInt(scanner.nextLine());
        
        // Read input string
        String inp = scanner.nextLine();
        
        // Initialize variables
        int rC = 0;
        int cnt = 0;
        
        // Count occurrences of 'R' in the input string
        for (char c : inp.toCharArray()) {
            if (c == 'R') {
                rC++;
            }
        }
        
        // Count occurrences of 'W' in the first rC characters
        for (int i = 0; i < rC; i++) {
            if (inp.charAt(i) == 'W') {
                cnt++;
            }
        }
        
        // Output the result
        System.out.println(cnt);
        
        scanner.close();
    }
}
```

### Explanation:
1. **Input Reading**: The program reads the input size `n` and then the input string `inp`.
2. **Counting 'R's**: It counts the number of 'R' characters in the input string using a loop.
3. **Counting 'W's**: It then counts the number of 'W' characters in the first `rC` characters of the input string.
4. **Output**: Finally, it prints the count of 'W' characters.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 features and best practices.