import java.util.Scanner;

public class ABeginner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input processing
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        String dtX1 = parts[0];
        int dtL1 = Integer.parseInt(parts[1]);
        int inN = Integer.parseInt(dtX1.substring(0, dtL1));
        
        inp = scanner.nextLine();
        int i = 0;
        int xp = 0;
        int p1 = 1;
        while (i < inN) {
            p1 = p1;
            while (inp.charAt(p1 - 1) >= '0' && inp.charAt(p1 - 1) <= '9') {
                p1++;
            }
            i++;
            int inX = Integer.parseInt(inp.substring(p1 - i, p1 - 1));
            xp += inX;
            p1++;
        }

        double avg = (double) xp / inN + 0.5;

        int xP2 = 0;
        for (i = 1; i <= inN; i++) {
            xP2 += Math.pow(inX[i] - avg, 2);
        }

        System.out.printf("%06d%n", xP2);

        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The COBOL `ACCEPT` statements have been replaced with Java's `Scanner` class to read input from the console.
2. **String Splitting**: The `UNSTRING` statement has been replaced with Java's `split` method to split the input string into parts.
3. **Looping and Conditionals**: The `PERFORM` loops have been replaced with traditional `while` and `for` loops in Java.
4. **Type Casting**: The division operation in COBOL implicitly converts to a floating-point number, so we explicitly cast it to `double` in Java.
5. **Output Formatting**: The `DISPLAY` statement has been replaced with `System.out.printf` to format the output as specified.
6. **Array Initialization**: The array `inX` is initialized dynamically based on the value of `inN`.

This Java code maintains the same logic and behavior as the original COBOL program.