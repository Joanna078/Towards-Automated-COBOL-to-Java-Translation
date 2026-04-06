import java.util.Scanner;

public class ABC150A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input line
        String inputLine = scanner.nextLine();
        
        int p1 = 0;
        int a1 = 0, a2 = 0, a3 = 0;
        
        // Extract first number
        int p2 = 1;
        while (p1 + p2 < inputLine.length() && inputLine.charAt(p1 + p2) != ' ') {
            p2++;
        }
        a1 = Integer.parseInt(inputLine.substring(p1, p1 + p2));
        p1 += p2 + 1;
        
        // Extract second number
        p2 = 1;
        while (p1 + p2 < inputLine.length() && inputLine.charAt(p1 + p2) != ' ') {
            p2++;
        }
        a2 = Integer.parseInt(inputLine.substring(p1, p1 + p2));
        p1 += p2 + 1;
        
        // Extract third number
        p2 = 1;
        while (p1 + p2 < inputLine.length() && inputLine.charAt(p1 + p2) != ' ') {
            p2++;
        }
        a3 = Integer.parseInt(inputLine.substring(p1, p1 + p2));
        
        // Check if sum is less than or equal to 21
        if (a1 + a2 + a3 <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
        
        scanner.close();
    }
}
```

### Explanation of the Code:
1. **Input Reading**: The `Scanner` class is used to read the input line from the user.
2. **Variable Initialization**: Variables `a1`, `a2`, and `a3` are initialized to store the extracted numbers.
3. **Extracting Numbers**:
   - A loop is used to find the end of each number by checking for spaces.
   - The `substring` method extracts the number as a string, which is then converted to an integer using `Integer.parseInt`.
4. **Sum Calculation and Output**:
   - The sum of `a1`, `a2`, and `a3` is calculated.
   - If the sum is less than or equal to 21, "win" is printed; otherwise, "bust" is printed.