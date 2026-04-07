import java.util.Scanner;

public class ABC_101_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        String s = scanner.nextLine();
        
        int ss = 0;
        
        // Perform loop
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                ss++;
            } else {
                ss--;
            }
        }
        
        // Convert result to string
        String ans = Integer.toString(ss);
        
        // Display output
        System.out.println(ans);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read input from the console.
2. **Loop**: Replaced the `PERFORM VARYING` loop with a traditional `for` loop for better readability and understanding.
3. **String Operations**: Used `charAt` instead of `S(i:len)` to access characters in the string.
4. **Conversion**: Converted the integer result to a string using `Integer.toString`.
5. **Output**: Used `System.out.println` to display the result directly.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices and syntax.