import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a string:");
        String inp = scanner.nextLine();
        
        // Processing
        int n = inp.split(" ").length;
        String[] s = inp.split(" ");
        int h = 0;
        int i = 0;
        int j = n - 1;
        
        while (i < j) {
            if (!s[i].equals(s[j])) {
                h++;
            }
            i++;
            j--;
        }
        
        // Output
        System.out.println(h);
        
        scanner.close();
    }
}
```

### Explanation of the Conversion:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with a `Scanner` to read user input from the console.
2. **String Splitting**: The COBOL `UNSTRING` statement is replaced with Java's `split` method to split the input string into an array of substrings.
3. **Looping and Conditionals**: The COBOL `PERFORM UNTIL` loop is converted to a `while` loop in Java. The condition `I >= J` is used to control the loop.
4. **Comparison**: The COBOL `NOT =` operator is replaced with the Java `!equals` method for string comparison.
5. **Output**: The COBOL `DISPLAY` statement is replaced with a `System.out.println` call to output the result.
6. **Resource Management**: The `Scanner` object is closed after use to free up resources.