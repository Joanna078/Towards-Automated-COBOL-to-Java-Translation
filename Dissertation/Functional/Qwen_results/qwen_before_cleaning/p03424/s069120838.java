import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String arare = scanner.nextLine();
        
        // Initialize answer
        String ans = "Three";
        
        // Multiply n by 2 and subtract 1
        n *= 2;
        n--;
        
        // Loop through arare string
        while (n >= 0 && arare.charAt(n) != 'Y') {
            n--;
        }
        
        // Check if 'Y' is found
        if (n >= 0) {
            ans = "Four";
        }
        
        // Output the result
        System.out.println(ans.trim());
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` statements with `Scanner` to read input from the console.
2. **Data Types**: Changed `BINARY-SHORT` to `int` and `PIC X(200)` to `String`.
3. **Logic**: Translated the loop and conditional logic into a `while` loop in Java.
4. **String Access**: Used `charAt` method to access characters in the `arare` string.
5. **Output**: Used `System.out.println` to display the result.
6. **Resource Management**: Added `scanner.close()` to close the scanner after use.