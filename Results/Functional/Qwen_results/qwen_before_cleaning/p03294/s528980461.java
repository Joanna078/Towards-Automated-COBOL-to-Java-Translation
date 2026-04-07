import java.util.Scanner;

public class ABC_103_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        long sm = 0;
        int maxlen = 3000;
        int cur = 1;
        int i = 1;
        
        while (i <= maxlen) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            
            int len = j - cur;
            String a = inp.substring(cur - 1, cur - 1 + len);
            int numA = Integer.parseInt(a) - 1;
            sm += numA;
            
            cur = j + 1;
            i++;
        }
        
        String zs = Long.toString(sm);
        
        StringBuilder ans = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }
        
        System.out.println(ans.toString().trim());
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with a `Scanner` to read input from the console.
2. **Looping**: The `PERFORM` loop is replaced with a `while` loop in Java.
3. **String Operations**: The `SUBSTRING` operation in COBOL is replaced with `substring` in Java.
4. **Type Conversion**: The `MOVE` statements for numeric conversions are replaced with `Integer.parseInt`.
5. **String Manipulation**: The `UNSTRING` operation is replaced with a simple loop to remove spaces from the string.
6. **Output**: The `DISPLAY` statement is replaced with `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program.