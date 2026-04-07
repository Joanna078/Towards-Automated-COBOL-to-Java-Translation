import java.util.Scanner;

public class Bishop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter values: ");
        String input = scanner.nextLine();
        
        // Split input into components
        String[] parts = input.split(" ");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);
        
        // Output initialization
        int out;
        
        // Logic
        if (h == 1 || w == 1) {
            out = 0;
        } else {
            int s1 = h / 2;
            int s2 = w / 2;
            if (h == s1 * 2 || w == s2 * 2) {
                out = h * w / 2;
            } else {
                out = h * w / 2 + 1;
            }
        }
        
        // Output
        System.out.println(out);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **String Splitting**: Used `split` method to separate the input string into individual components.
3. **Integer Parsing**: Converted the split strings to integers using `Integer.parseInt`.
4. **Output**: Replaced `DISPLAY` with `System.out.println` to print the result.
5. **Java 17 Features**: No specific Java 17 features were used as the original logic was straightforward and did not require advanced language features.
6. **Comments**: Added comments to explain the logic where necessary.