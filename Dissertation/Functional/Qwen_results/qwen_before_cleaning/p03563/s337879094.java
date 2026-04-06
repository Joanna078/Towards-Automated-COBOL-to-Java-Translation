import java.util.Scanner;

public class ABC_076_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Working storage variables
        int r;
        int g;
        StringBuilder zs = new StringBuilder();
        String ans = "";

        // Input section
        System.out.print("Enter R: ");
        r = scanner.nextInt();
        System.out.print("Enter G: ");
        g = scanner.nextInt();

        // Logic section
        r -= g;
        r += g;
        zs.append(r);
        unans(zs, ans);

        // Output section
        System.out.println(ans.substring(0, ans.length()));
    }

    private static void unans(StringBuilder zs, String ans) {
        // Unstring logic
        String dummy = "";
        ans = zs.toString().trim(); // Remove leading/trailing spaces
    }
}
```

### Explanation of Changes:
1. **Data Types**: Replaced COBOL data types with appropriate Java data types (`int` for numeric values and `StringBuilder` for string manipulation).
2. **Input/Output**: Used `Scanner` for input and `System.out.println` for output.
3. **String Manipulation**: Used `StringBuilder` for string operations instead of COBOL's `UNSTRING`.
4. **Comments**: Added comments to explain the logic where necessary.
5. **Modern Java Features**: Used modern Java 17 features such as `var` (though not used here due to clarity), but generally adhered to clean and readable code practices.