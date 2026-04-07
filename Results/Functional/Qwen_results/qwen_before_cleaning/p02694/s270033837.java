import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a string:");
        String inp = scanner.nextLine();
        
        int len = inp.split(" ").length;
        long x = 0;
        double y = 100;
        int i = 1;
        
        if (len <= 18) {
            x = Long.parseLong(inp);
            
            while (i <= 3759 && y < x) {
                y += y * 0.01;
                i++;
            }
        } else {
            i = 3760;
        }
        
        // Output
        System.out.printf("%d%n", i);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **String Splitting**: Used `split(" ")` to count the number of words in the input string.
3. **Data Types**: Converted `X`, `Y`, and `I` to appropriate Java types (`long`, `double`, and `int`).
4. **Loop Structure**: Replaced the COBOL `PERFORM` loop with a `while` loop in Java.
5. **Output Formatting**: Used `System.out.printf` to format the output as specified.
6. **Resource Management**: Closed the `Scanner` object after use to avoid resource leaks.