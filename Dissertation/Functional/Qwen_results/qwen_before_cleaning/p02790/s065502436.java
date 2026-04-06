import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        // Splitting input into two parts
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Determine the larger number
        int n;
        if (a <= b) {
            n = b;
        } else {
            n = a;
            a = b;
        }
        
        // Create output string
        StringBuilder out = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            out.append(a);
        }
        
        // Output
        System.out.println(out.toString());
        
        scanner.close();
    }
}
```

### Explanation of the Code:
1. **Input Handling**: The program reads a line of input from the user, which is expected to contain two numbers separated by a space.
2. **Splitting Input**: The input string is split into two parts using `split(" ")`, and then converted to integers.
3. **Determine Larger Number**: The program checks if `a` is less than or equal to `b`. If true, it assigns `b` to `n`; otherwise, it swaps `a` and `b` and assigns `b` to `n`.
4. **Create Output String**: Using a `StringBuilder`, the program appends the value of `a` to the output string `n` times.
5. **Output**: Finally, the program prints the constructed output string.