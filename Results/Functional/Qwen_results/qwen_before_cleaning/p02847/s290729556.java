import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        String inp = scanner.nextLine();
        
        // Check the first three characters of the input string
        if ("SUN".equals(inp.substring(0, 3))) {
            System.out.println("7");
        } else if ("MON".equals(inp.substring(0, 3))) {
            System.out.println("6");
        } else if ("TUE".equals(inp.substring(0, 3))) {
            System.out.println("5");
        } else if ("WED".equals(inp.substring(0, 3))) {
            System.out.println("4");
        } else if ("THU".equals(inp.substring(0, 3))) {
            System.out.println("3");
        } else if ("FRI".equals(inp.substring(0, 3))) {
            System.out.println("2");
        } else if ("SAT".equals(inp.substring(0, 3))) {
            System.out.println("1");
        }
        
        scanner.close();
    }
}
```

### Explanation:
- **Scanner**: Used to read input from the user.
- **String.substring()**: Extracts the first three characters of the input string.
- **if-else statements**: Checks the extracted substring against each day of the week and prints the corresponding number.
- **System.out.println()**: Prints the result to the console.