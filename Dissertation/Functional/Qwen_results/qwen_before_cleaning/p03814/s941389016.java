import java.util.Scanner;

public class ABC_053_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inp1 = new StringBuilder();
        
        // Read input from keyboard
        while (scanner.hasNextLine()) {
            inp1.append(scanner.nextLine());
        }
        
        int len = inp1.length();
        
        int i = 1;
        while (i <= len && inp1.charAt(i - 1) != 'A') {
            i++;
        }
        
        int j = len;
        while (j >= 1 && inp1.charAt(j - 1) != 'Z') {
            j--;
        }
        
        if (i <= j) {
            j++;
        }
        
        String zs = String.format("%07d", j);
        
        String ans = unstring(zs);
        
        System.out.println(ans.substring(0, ans.length()));
    }

    private static String unstring(String zs) {
        return zs.trim().replaceAll("\\s+", "");
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's file control with Java's `Scanner` to read input from the keyboard.
2. **String Manipulation**: Used `StringBuilder` for efficient string manipulation.
3. **Looping**: Replaced COBOL's `PERFORM VARYING` loops with Java's `while` loops.
4. **Formatting**: Used `String.format` to format the integer as a zero-padded string.
5. **Substring Extraction**: Used `substring` method to extract the required part of the string.
6. **Unstring Function**: Created a helper function `unstring` to remove spaces from the string, similar to COBOL's `UNSTRING`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices.