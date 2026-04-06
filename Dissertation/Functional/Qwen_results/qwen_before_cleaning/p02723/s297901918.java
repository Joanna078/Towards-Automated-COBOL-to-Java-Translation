import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        System.out.print("Enter a string of length 6: ");
        String s = scanner.nextLine();
        
        // Check if the input is exactly 6 characters long
        if (s.length() != 6) {
            System.out.println("Input must be 6 characters long.");
            return;
        }
        
        // Extract substrings and compare
        char thirdChar = s.charAt(2); // Indexing starts at 0 in Java
        char fourthChar = s.charAt(3);
        char fifthChar = s.charAt(4);
        char sixthChar = s.charAt(5);
        
        if (thirdChar == fourthChar && fifthChar == sixthChar) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

### Explanation:
1. **Input Handling**: The `Scanner` class is used to read input from the user.
2. **Validation**: The program checks if the input string is exactly 6 characters long.
3. **Character Extraction**: Characters are extracted using the `charAt` method, which is zero-indexed in Java.
4. **Comparison and Output**: The comparison logic is preserved, and the result is printed accordingly.