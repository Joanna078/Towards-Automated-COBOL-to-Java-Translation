import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String ln = scanner.nextLine();
        
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int cnt = 0;
        int zs = 0;
        int p;
        
        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            p = Integer.parseInt(ln.substring(cur - 1, cur - 1 + len));
            
            if (p != i) {
                cnt++;
            }
            
            cur = j + 1;
            i++;
        }
        
        if (cnt <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` statements with `Scanner` to read input from the console.
2. **String Operations**: Used `substring` method instead of COBOL's string slicing.
3. **Looping**: Replaced COBOL's `PERFORM` loops with Java's `while` loops.
4. **Comparison**: Used `==` for integer comparison instead of `<>`.
5. **Output**: Replaced `DISPLAY` with `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program.