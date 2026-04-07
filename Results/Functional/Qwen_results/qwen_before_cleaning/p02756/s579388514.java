import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string S
        String s = scanner.nextLine();
        String[] parts = s.split(" ");
        int pos2 = parts.length;

        // Initialize positions
        int pos1 = 200000;
        pos2 += 200000;

        // Input integer Q
        int q = Integer.parseInt(scanner.nextLine());

        // Array to simulate FORMA
        char[] forma = new char[400000];
        for (int i = 0; i < forma.length; i++) {
            forma[i] = ' ';
        }

        // Process each input line
        for (int i = 0; i < q; i++) {
            String inp = scanner.nextLine();
            parts = inp.split(" ");
            char t = parts[0].charAt(0);
            char f = parts[1].charAt(0);
            char c = parts[2].charAt(0);

            if (t == '1') {
                char w = forma[pos1];
                forma[pos1] = forma[pos2];
                forma[pos2] = w;
            } else {
                if (f == '1') {
                    pos1--;
                    forma[pos1] = c;
                } else {
                    pos2++;
                    forma[pos2] = c;
                }
            }
        }

        // Display the result
        System.out.println(new String(forma, pos1, pos2 - pos1 + 1));

        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Used `Scanner` to read input from the console.
2. **String Splitting**: Used `split` method to split strings into arrays.
3. **Array Simulation**: Used a character array to simulate the `FORMA` structure.
4. **Loop and Conditionals**: Translated the loop and conditional statements to match the original COBOL logic.
5. **Character Operations**: Used character operations directly instead of string manipulation where possible.
6. **Output**: Printed the final result using `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards and best practices.