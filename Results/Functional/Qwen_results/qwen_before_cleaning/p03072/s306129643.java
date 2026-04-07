import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        int cnt = 0;
        int max = 0;
        int p1 = 0;
        
        // Process
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            String h = inp.substring(p1, p2);
            int hValue = Integer.parseInt(h);
            
            if (hValue >= max) {
                cnt++;
            }
            if (hValue > max) {
                max = hValue;
            }
            
            p1 = p2 + 1;
        }
        
        // Output
        System.out.println(cnt);
    }
}
```

### Explanation of the Conversion:
1. **Input Handling**: The COBOL `ACCEPT` statements are replaced with Java's `Scanner` class to read input from the console.
2. **Data Storage**: The COBOL working-storage section is replaced with Java variables.
3. **Looping and Conditional Logic**: The COBOL `PERFORM` loops are converted to Java `for` and `while` loops. The conditional logic remains the same.
4. **String Operations**: The COBOL string operations (`INP(P1:P2 - P1)` and `SUBSTRING`) are replaced with Java's `substring` method.
5. **Output**: The COBOL `DISPLAY` statement is replaced with Java's `System.out.println`.

This Java code maintains the same functionality as the original COBOL program.