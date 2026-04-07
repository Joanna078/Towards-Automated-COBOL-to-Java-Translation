import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        String inp = scanner.nextLine();
        
        int temp1 = 0;
        
        // Find the first space character
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        
        // Extract substring before the first space as A
        String aStr = inp.substring(0, temp1);
        long a = Long.parseLong(aStr);
        
        // Move past the space
        temp1 += 2;
        
        int temp2 = temp1;
        
        // Find the next space character
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        
        // Calculate the length of the substring between spaces as N
        int n = temp2 - temp1;
        
        // Extract substring between spaces as B
        String bStr = inp.substring(temp1, temp2);
        long b = Long.parseLong(bStr);
        
        long e;
        
        // Determine the value of E based on the value of A
        if (a >= 13) {
            e = b;
        } else if (a >= 6) {
            e = b / 2;
        } else {
            e = 0;
        }
        
        // Display the result
        System.out.println(e);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with a `Scanner` object to read input from the console.
2. **String Processing**: The COBOL `PERFORM` loops are replaced with `while` loops to find the positions of spaces and extract substrings.
3. **Type Conversion**: The COBOL `MOVE` statements are replaced with `Long.parseLong` to convert string parts to integers.
4. **Conditional Logic**: The COBOL `IF-THEN-ELSE` structure is directly translated into Java's `if-else` statements.
5. **Output**: The COBOL `DISPLAY` statement is replaced with `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program.