import java.util.Scanner;

public class ABC_060_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Split input into components
        String[] parts = inp.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        
        int num = a;
        int flg = 0;
        int pi = 0;
        
        // Loop until condition is met or exceeded
        while (a * b >= num) {
            if (num % b == c) {
                flg = 1;
                break;
            } else {
                pi++;
                num *= a;
            }
        }
        
        // Output result
        if (flg == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` for reading user input.
2. **String Splitting**: Used `split("\\s+")` to split the input string by spaces.
3. **Loop Structure**: Replaced `PERFORM VARYING` with a `while` loop for better readability and control flow.
4. **Conditional Logic**: Kept the conditional logic intact but used modern Java syntax.
5. **Output**: Replaced `DISPLAY` with `System.out.println`.
6. **Resource Management**: Added `scanner.close()` to close the scanner resource after use.