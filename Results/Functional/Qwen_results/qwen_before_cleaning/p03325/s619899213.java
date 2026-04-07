import java.util.Scanner;

public class ABC_999_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        long sum = 0;
        int cur = 0;
        int i = 1;
        
        while (cur < n) {
            int j = cur;
            while (j < n && inp.charAt(j) != ' ') {
                j++;
            }
            
            int len = j - cur;
            String a = inp.substring(cur, cur + len);
            
            int num = getNum(a);
            sum += num;
            
            cur = j + 1;
            i++;
        }
        
        String zs = String.format("%06d", sum);
        String ans = unans(zs);
        
        System.out.println(ans.trim());
    }

    private static int getNum(String a) {
        int num = 0;
        while (!a.isEmpty()) {
            int r = Integer.parseInt(a) % 2;
            if (r == 0) {
                num++;
            } else {
                break;
            }
            a = String.valueOf(Integer.parseInt(a) / 2);
        }
        return num;
    }

    private static String unans(String zs) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with a `Scanner` to read input from the console.
2. **String Operations**: The COBOL string operations (`MOVE`, `SUBSTRING`, etc.) are replaced with Java's string methods (`substring`, `trim`, etc.).
3. **Looping and Conditionals**: The COBOL loop and conditional statements are translated into Java's `while` loops and `if-else` statements.
4. **Formatting**: The COBOL `MOVE` statement with format specifiers is replaced with Java's `String.format`.
5. **Method Extraction**: Complex logic is extracted into separate methods (`getNum` and `unans`) for better readability and reusability.

This Java code maintains the same functionality as the original COBOL program.