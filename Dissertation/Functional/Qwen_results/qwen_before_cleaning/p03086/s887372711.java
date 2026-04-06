import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String s = scanner.nextLine();
        
        int cnt = 0;
        int max = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < Math.min(s.length(), 10); i++) {
            char c = s.charAt(i);
            
            if ("ACGT".indexOf(c) != -1) {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                }
            } else {
                cnt = 0;
            }
        }
        
        // Output the result
        System.out.println(max);
    }
}
```

### Explanation of the Code:
1. **Input Handling**: The program reads a single line of input using `Scanner`.
2. **Initialization**: Variables `cnt` and `max` are initialized to zero.
3. **Loop Through Characters**: A loop iterates over the first 10 characters of the input string (or fewer if the string is shorter than 10 characters).
4. **Character Check**: For each character, it checks if it is one of 'A', 'C', 'G', or 'T'. If so, it increments `cnt`. If not, it resets `cnt` to zero.
5. **Update Maximum Count**: If `cnt` exceeds `max`, `max` is updated.
6. **Output**: Finally, the maximum count (`max`) is printed.

This Java code preserves the logic and behavior of the original COBOL program while adhering to modern Java practices and syntax.