```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input handling
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers separated by spaces:");
        String input = scanner.nextLine();
        
        // Splitting the input into individual strings
        String[] parts = input.split(" ");
        
        // Parsing the strings into integers
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        
        // Calculating the differences
        int ans1 = b - a;
        int ans2 = c - b;
        
        // Output based on the condition
        if (ans1 == ans2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        // Closing the scanner
        scanner.close();
    }
}
```