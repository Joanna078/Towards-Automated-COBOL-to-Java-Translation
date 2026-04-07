import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        
        // Constants
        final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alphabetArray = ALPHABET.toCharArray();
        int[] shiftTable = new int[256];
        
        // Initialize shift table
        for (int i = 0; i < 26; i++) {
            shiftTable[i] = i;
        }
        
        // Shift characters based on input string
        if (n > 0) {
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                int index = ALPHABET.indexOf(currentChar);
                if (index != -1) {
                    char shiftedChar = alphabetArray[(index + n) % 26];
                    input = input.substring(0, i) + shiftedChar + input.substring(i + 1);
                }
            }
        }
        
        // Output result
        System.out.println(input);
    }
}
```

This Java code preserves the logic of the original COBOL program, including reading input, shifting characters based on a given number, and displaying the output. It uses modern Java 17 features such as `Scanner` for input handling and array indexing for character manipulation.