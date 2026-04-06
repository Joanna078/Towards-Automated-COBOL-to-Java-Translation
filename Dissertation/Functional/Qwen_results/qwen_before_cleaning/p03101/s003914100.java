import java.util.Scanner;

public class Test121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        String inp;
        int h1, w1, h2, w2, wk;
        String ans;

        // Read first line of input
        System.out.println("Enter values for H1 W1: ");
        inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        h1 = Integer.parseInt(parts[0]);
        w1 = Integer.parseInt(parts[1]);

        // Read second line of input
        System.out.println("Enter values for H2 W2: ");
        inp = scanner.nextLine();
        parts = inp.split(" ");
        h2 = Integer.parseInt(parts[0]);
        w2 = Integer.parseInt(parts[1]);

        // Compute WK
        wk = (h1 - h2) * (h1 - h2);
        ans = String.format("%04d", wk); // Format to ensure 4 digits with leading zeros

        // Display result
        System.out.println(ans);

        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` statements with `Scanner` to read user input from the console.
2. **String Splitting**: Used `split` method to split the input string into parts based on spaces.
3. **Integer Parsing**: Converted the split parts into integers using `Integer.parseInt`.
4. **Formatting Output**: Used `String.format` to format the output to ensure it has exactly four digits, padding with leading zeros if necessary.
5. **Java 17 Features**: No specific Java 17 features were used as the original code was already quite simple. However, the use of `var` would be possible but not shown here for clarity.