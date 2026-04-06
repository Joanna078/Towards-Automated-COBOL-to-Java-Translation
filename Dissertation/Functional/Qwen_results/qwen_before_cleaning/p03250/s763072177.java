import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split(" ");
        int a1 = Integer.parseInt(parts[0]);
        int a2 = Integer.parseInt(parts[1]);
        int a3 = Integer.parseInt(parts[2]);

        int r;
        if (a2 <= a1 && a3 <= a1) {
            r = 10 * a1 + a2 + a3;
        } else if (a1 <= a2 && a3 <= a2) {
            r = 10 * a2 + a1 + a3;
        } else {
            r = 10 * a3 + a2 + a1;
        }

        System.out.printf("%02d%n", r);
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` statement with Java's `Scanner` to read input from the console.
2. **Data Parsing**: Used `split` method to split the input string into individual components and then parsed them into integers.
3. **Conditional Logic**: Translated the nested `IF-ELSE` statements directly into Java syntax.
4. **Output Formatting**: Used `System.out.printf` to format the output as required, ensuring it matches the original COBOL `DISPLAY` statement.
5. **Java 17 Features**: No specific Java 17 features were used in this translation, but the code is written in a style that would be compatible with Java 17.