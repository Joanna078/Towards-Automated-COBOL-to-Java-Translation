import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;
        String aStr = inp.substring(0, temp1 + 1);

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        int n = temp2 - temp1;
        String bStr = inp.substring(temp1, temp2);

        temp2 += 1;
        int temp3 = temp2;
        while (temp3 < inp.length() && inp.charAt(temp3) != ' ') {
            temp3++;
        }
        n = temp3 - temp2;
        String cStr = inp.substring(temp2, temp3);

        long a = Long.parseLong(aStr);
        long b = Long.parseLong(bStr);
        long c = Long.parseLong(cStr);

        c = c / a;
        c = c * b;

        System.out.printf("%d%n", c);
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read input from the console.
2. **String Parsing**: Used `substring` to extract parts of the input string and then parsed them into `long` values.
3. **Looping**: Replaced COBOL's `PERFORM VARYING` loops with Java's `while` loops for better readability and control.
4. **Division and Multiplication**: Kept the division and multiplication operations as they were in the original COBOL code.
5. **Output**: Used `System.out.printf` to format and print the output, similar to COBOL's `DISPLAY`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards and best practices.