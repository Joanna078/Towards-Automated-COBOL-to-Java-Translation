import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // WORKING-STORAGE SECTION
        int n;
        int i;
        int qt;
        int rm;
        int ans = 0;
        int num;
        String zs;
        
        // ACCEPT N
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        
        // PERFORM VARYING i FROM 1 BY 1 UNTIL N < i
        for (i = 1; i <= n; i++) {
            // COMPUTE num = FUNCTION LOG10(i)
            num = (int) Math.log10(i);
            
            // ADD 1 TO num
            num += 1;
            
            // DIVIDE num BY 2 GIVING qt REMAINDER rm
            qt = num / 2;
            rm = num % 2;
            
            // IF rm = 1
            if (rm == 1) {
                // ADD 1 TO ans
                ans += 1;
            }
        }
        
        // MOVE ans TO zs
        zs = String.format("%d", ans);
        
        // DISPLAY FUNCTION TRIM(zs)
        System.out.println(zs.trim());
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Scanner for Input**: Replaced `ACCEPT` with a `Scanner` object to read user input from the console.
2. **Loop Replacement**: Replaced the `PERFORM VARYING` loop with a standard `for` loop in Java.
3. **Math Functions**: Used `Math.log10` instead of `FUNCTION LOG10`.
4. **String Formatting**: Used `String.format` to convert integers to strings.
5. **Trimming**: Used `trim()` on the string to remove any leading or trailing whitespace.
6. **Java 17 Features**: No specific Java 17 features were used as the original code was already quite simple. However, you can use Java 17's switch expressions or records if needed for further improvements.