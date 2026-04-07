import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String ln = scanner.nextLine();
        String[] parts = ln.split(" ");
        String s = parts[0];
        String t = parts[1];
        
        ln = scanner.nextLine();
        parts = ln.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        String u = scanner.nextLine();
        
        if (s.equals(u)) {
            a--;
        } else {
            b--;
        }
        
        StringBuilder zs = new StringBuilder(String.format("%02d", a));
        StringBuilder ans = new StringBuilder();
        unans(zs, ans);
        
        zs = new StringBuilder(String.format("%02d", b));
        unans(zs, ans);
        
        String result = ans.toString().trim() + " " + ans.toString().trim();
        System.out.println(result.trim());
        
        scanner.close();
    }

    private static void unans(StringBuilder zs, StringBuilder ans) {
        while (zs.length() > 0 && zs.charAt(0) == ' ') {
            zs.deleteCharAt(0);
        }
        ans.append(zs);
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` statements with `Scanner` to read input from the console.
2. **String Splitting**: Used `split` method to split strings into arrays.
3. **Integer Parsing**: Converted string inputs to integers using `Integer.parseInt`.
4. **StringBuilder**: Used `StringBuilder` for mutable string operations.
5. **Formatted Strings**: Used `String.format` to format numbers as strings.
6. **Loop for Spaces**: Simplified the loop to remove leading spaces from `zs`.

This Java code maintains the same logic and behavior as the original COBOL program.