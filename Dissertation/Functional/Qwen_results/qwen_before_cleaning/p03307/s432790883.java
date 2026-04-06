import java.util.Scanner;

public class ABC_102_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = Integer.parseInt(scanner.nextLine());
        
        // Processing
        int x = n / 2;
        int d = n % 2;
        
        if (d != 0) {
            n *= 2;
        }
        
        String zs = String.format("%011d", n);
        
        String dummy = "";
        StringBuilder ans = new StringBuilder();
        
        for (char c : zs.toCharArray()) {
            if (c == ' ') continue;
            dummy += c;
            ans.append(c);
        }
        
        // Output
        System.out.println(ans.toString().trim());
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Used `Scanner` to read input from the console.
2. **Division and Modulo Operations**: Replaced COBOL's `DIVIDE` and `MODULO` with Java's `/` and `%`.
3. **String Formatting**: Used `String.format` to ensure `ZS` is always 11 digits long.
4. **StringBuilder**: Used `StringBuilder` for efficient string manipulation.
5. **Loop and Conditionals**: Replaced COBOL's `PERFORM` loop with a traditional `for` loop in Java.
6. **Output**: Used `System.out.println` to display the result, trimming any trailing spaces.