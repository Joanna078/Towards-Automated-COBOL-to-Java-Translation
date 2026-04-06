import java.util.Scanner;

public class ABC_107_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter input (format: N i): ");
        String inp = scanner.nextLine();
        
        // Data division
        int n = 0;
        int i = 0;
        String[] parts = inp.split("\\s+");
        if (parts.length == 2) {
            n = Integer.parseInt(parts[0]);
            i = Integer.parseInt(parts[1]);
        }
        
        // Processing section
        i -= i;
        i++;
        
        // Output section
        String ans = String.format("%03d", i);
        unans(ans);
        
        System.out.println(ans.trim());
    }

    private static void unans(String ans) {
        StringBuilder sb = new StringBuilder();
        for (char c : ans.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        ans = sb.toString();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The `ACCEPT` statement is replaced with a `Scanner` to read user input from the console.
2. **Data Division**: The working storage section is translated into local variables in the `main` method.
3. **Processing Section**: The arithmetic operations and string manipulation are performed using standard Java methods.
4. **Output Section**: The `DISPLAY` statement is replaced with `System.out.println`, and the output is trimmed to remove any leading or trailing spaces.
5. **UnANS Section**: The `UNSTRING` operation is replaced with a simple loop that removes spaces from the string.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and syntax.