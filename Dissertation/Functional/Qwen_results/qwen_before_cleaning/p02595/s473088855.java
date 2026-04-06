import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input processing
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Splitting input into components
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        double d = Double.parseDouble(parts[1]);
        
        // Initialize counter
        int cnt = 0;
        
        // Loop through each pair of numbers
        for (int i = 2; i < parts.length; i += 2) {
            double x = Double.parseDouble(parts[i]);
            double y = Double.parseDouble(parts[i + 1]);
            
            // Calculate distance
            double k = Math.sqrt(x * x + y * y);
            
            // Check if within range
            if (k <= d) {
                cnt++;
            }
        }
        
        // Output result
        System.out.println(cnt);
    }
}
```

### Explanation:
1. **Input Handling**: The program reads a single line of input from the user using `Scanner`.
2. **Splitting Input**: The input string is split into parts based on spaces.
3. **Initialization**: Variables `n` and `d` are initialized with the first two parts of the input.
4. **Loop Through Pairs**: A loop iterates over the remaining parts, taking pairs of numbers at a time.
5. **Distance Calculation**: For each pair, the Euclidean distance is calculated using `Math.sqrt`.
6. **Range Check**: If the distance is less than or equal to `d`, the counter is incremented.
7. **Output**: Finally, the count is printed to the console.