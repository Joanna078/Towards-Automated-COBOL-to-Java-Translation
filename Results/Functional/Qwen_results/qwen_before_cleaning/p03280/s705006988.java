import java.util.Scanner;

public class ABC_106_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Data section
        int a = Integer.parseInt(inp.split(" ")[0]);
        int b = Integer.parseInt(inp.split(" ")[1]);
        int tmp = a * b - (a + b - 1);
        int zs = tmp;
        
        // Logic section
        StringBuilder ans = new StringBuilder();
        while (zs != 0) {
            ans.insert(0, zs % 10);
            zs /= 10;
        }
        
        // Output section
        System.out.println(ans.toString());
    }
}
```

### Explanation of the Conversion:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with a `Scanner` to read user input from the console.
2. **Data Section**: Variables `a`, `b`, `tmp`, and `zs` are declared as integers.
3. **Logic Section**:
   - The multiplication and subtraction operations are performed directly using integer arithmetic.
   - The result (`zs`) is converted to a string by repeatedly taking the remainder when divided by 10 and prepending it to a `StringBuilder`.
4. **Output Section**: The final string representation of `zs` is printed to the console.