import java.util.Scanner;

public class ABC_063_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String s = scanner.nextLine();
        
        int len = s.length();
        boolean[] flg = new boolean[26];
        boolean used = false;
        
        // Initialize flag array
        for (int i = 0; i < 26; i++) {
            flg[i] = false;
        }
        
        // Check each character in the string
        for (int i = 0; i < len && !used; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!flg[index]) {
                    flg[index] = true;
                } else {
                    used = true;
                }
            }
        }
        
        // Output result
        if (used) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
        
        scanner.close();
    }
}
```

### Explanation of the Conversion:
1. **Input Handling**: The `Scanner` class is used to read the input string from the user.
2. **String Length Calculation**: The length of the string is calculated using `s.length()`.
3. **Flag Array Initialization**: A boolean array `flg` of size 26 is initialized to keep track of whether each letter has been encountered.
4. **Character Checking Loop**: The loop iterates through each character of the string. If the character is a lowercase letter, its corresponding position in the `flg` array is checked. If it has already been encountered (`flg[index]` is `true`), `used` is set to `true`. Otherwise, `flg[index]` is set to `true`.
5. **Output Result**: Based on the value of `used`, either "no" or "yes" is printed.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices and syntax.