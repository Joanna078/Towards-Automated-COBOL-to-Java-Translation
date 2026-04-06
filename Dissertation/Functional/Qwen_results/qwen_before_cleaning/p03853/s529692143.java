import java.util.Scanner;

public class ABC_049_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Working storage
        int h;
        int w;
        StringBuilder c = new StringBuilder();
        int i;
        
        // Unstringing input
        String[] parts = inp.split("\\s+");
        h = Integer.parseInt(parts[0]);
        w = Integer.parseInt(parts[1]);
        
        // Loop
        for (i = 1; h >= i; i++) {
            System.out.println("Enter string: ");
            c.append(scanner.nextLine());
            System.out.println(c.substring(0, c.length()));
            System.out.println(c.substring(0, c.length()));
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` for reading user input.
2. **String Splitting**: Used `split("\\s+")` to split the input string into parts based on spaces.
3. **Loop**: Replaced `PERFORM VARYING` with a traditional `for` loop for better readability and control.
4. **StringBuilder**: Used `StringBuilder` for efficient string manipulation.
5. **Comments**: Added comments for clarity where necessary.