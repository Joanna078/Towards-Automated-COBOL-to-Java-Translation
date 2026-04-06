import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input processing
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int x = Integer.parseInt(parts[1]);
        
        // Array initialization
        int[] l = new int[100];
        int p1 = 1;
        
        // Parsing input into array
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 <= inp.length() && inp.charAt(p2 - 1) != ' ') {
                p2++;
            }
            l[i - 1] = Integer.parseInt(inp.substring(p1 - 1, p2 - 1));
            p1 = p2 + 1;
        }
        
        // Calculation logic
        int z = 0, zo = 0, cnt = 0;
        while ((z <= x) && (n >= cnt)) {
            cnt++;
            z += zo + l[cnt - 1];
            zo = z;
        }
        
        // Output result
        System.out.println(cnt);
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The COBOL `ACCEPT` statements have been replaced with Java's `Scanner` class to read input from the console.
2. **Data Structures**: The COBOL arrays and variables have been translated into Java arrays and primitive types.
3. **Logic Translation**: The nested loops and conditional logic have been preserved in Java.
4. **Output**: The final result is printed using `System.out.println`.

This Java code maintains the same functionality as the original COBOL program.