import java.util.Scanner;

public class ABC_072_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        // Read input from standard input
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            sb.append(line);
        }
        
        String input = sb.toString();
        StringBuilder result = new StringBuilder();
        
        // Process each character of the input string
        for (int i = 0; i < input.length(); i++) {
            if ((i + 1) % 2 != 0) { // Check if the index is odd (1-based)
                result.append(input.charAt(i));
            }
        }
        
        // Display the result
        System.out.println(result.toString());
    }
}
```

### Explanation:
1. **Input Reading**: The COBOL program reads input from `SYSIN` until it encounters a space. In Java, we use a `Scanner` to read input from `System.in`.
2. **String Processing**: We iterate over each character of the input string. If the character's position (1-based) is odd, we append it to the result.
3. **Output**: Finally, we print the resulting string.

This Java code maintains the same logic and behavior as the original COBOL program.