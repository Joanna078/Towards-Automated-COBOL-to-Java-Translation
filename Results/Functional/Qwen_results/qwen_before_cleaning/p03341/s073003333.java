import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        
        // Initialize counters
        int wCnt = 0;
        int eCnt = 0;
        int min = n;
        int ww = 0;
        int ew = 0;
        int m;
        
        // Count occurrences of 'W' and 'E'
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'W') {
                wCnt++;
            } else {
                eCnt++;
            }
        }
        
        // Calculate minimum value
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'E') {
                ew++;
            }
            m = ww + (eCnt - ew);
            if (min > m) {
                min = m;
            }
            if (s.charAt(i) == 'W') {
                ww++;
            }
        }
        
        // Output result
        System.out.println(min);
    }
}
```

### Explanation of the Code:
1. **Input Reading**: The program reads two lines from standard input. The first line is the integer `n`, and the second line is the string `s`.
2. **Initialization**: Several counters (`wCnt`, `eCnt`, `min`, `ww`, `ew`) are initialized to zero or based on the length of the string `n`.
3. **Counting Occurrences**: The program iterates through the string `s` to count the occurrences of 'W' and 'E'.
4. **Calculating Minimum Value**: Another loop iterates through the string to calculate the minimum value using the formula provided in the COBOL code.
5. **Output**: Finally, the program prints the calculated minimum value.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.