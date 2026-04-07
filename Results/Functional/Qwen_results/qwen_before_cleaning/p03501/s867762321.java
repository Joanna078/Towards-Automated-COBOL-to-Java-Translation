import java.util.Scanner;

public class ABC_080_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        scanner.close();

        // Parsing input
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);

        // Logic processing
        int t;
        if (a * n <= b) {
            t = a * n;
        } else {
            t = b;
        }

        // Formatting output
        String zs = String.format("%04d", t);
        String ans = "";
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans += c;
            }
        }

        // Output result
        System.out.println(ans.substring(0, ans.length()));
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read input from the console.
2. **Parsing Input**: Used `split` method to parse the input string into individual components.
3. **Logic Processing**: Translated the conditional logic into Java syntax.
4. **Formatting Output**: Used `String.format` to format the integer as a zero-padded string and then filtered out spaces.
5. **Output Result**: Printed the final result using `System.out.println`.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and features.