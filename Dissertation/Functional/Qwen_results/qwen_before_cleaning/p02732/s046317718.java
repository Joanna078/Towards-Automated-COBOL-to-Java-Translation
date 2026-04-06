import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        
        // Initialize arrays
        int[] c = new int[n + 1];
        char[] a = new char[n + 1];
        
        // Initialize counters
        Arrays.fill(c, 0);
        
        // Process input
        int p1 = 1;
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 <= n && input.charAt(p2 - 1) != ' ') {
                p2++;
            }
            a[i] = input.substring(p1 - 1, p2 - 1).charAt(0);
            c[a[i]]++;
            p1 = p2 + 1;
        }
        
        // Calculate and display results
        for (int i = 1; i <= n; i++) {
            long cnt = 0;
            for (int j = 1; j <= n; j++) {
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

### Explanation of the Code:
1. **Input Reading**: The program reads the number `n` and the string `input` from standard input using a `Scanner`.
2. **Initialization**: Arrays `c` and `a` are initialized to store counts and characters respectively. The array `c` is filled with zeros.
3. **Processing Input**:
   - The program iterates through the input string to extract substrings separated by spaces.
   - Each substring is converted to a character and stored in array `a`, and its count is incremented in array `c`.
4. **Calculating Results**:
   - For each character in array `a`, the program calculates the number of pairs that can be formed where the character appears more than once.
   - The result is printed for each character.
5. **Output**: The results are displayed using `System.out.printf`.

This Java code maintains the logic and behavior of the original COBOL program while adhering to Java 17 standards and best practices.