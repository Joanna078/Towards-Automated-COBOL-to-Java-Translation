import java.util.Scanner;

public class ABC_063_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter three characters separated by space: ");
        String inp = scanner.nextLine();
        
        // Parse input
        String[] parts = inp.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Calculate
        int tmp = a + b;
        
        // Format result
        String zs = String.format("%03d", tmp);
        String ans = "";
        
        // Reverse string
        for (int i = zs.length() - 1; i >= 0; i--) {
            ans += zs.charAt(i);
        }
        
        // Output
        if (tmp >= 10) {
            System.out.println("error");
        } else {
            System.out.println(ans.trim());
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Used `Scanner` to read user input.
2. **Parsing Input**: Split the input string into parts using `split(" ")`.
3. **Calculation**: Added the two integers.
4. **Formatting**: Formatted the result to ensure it has three digits.
5. **Reversing String**: Reversed the formatted string manually.
6. **Output**: Checked if the result is greater than or equal to 10 and printed accordingly.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices.