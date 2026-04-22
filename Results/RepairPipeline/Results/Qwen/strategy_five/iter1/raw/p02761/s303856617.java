```java
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables
        char[] tbl = new char[3];
        for (int i = 0; i < tbl.length; i++) {
            tbl[i] = ' ';
        }
        String swErr = "0";
        
        // Read input
        String inp1 = scanner.nextLine();
        int n = Character.getNumericValue(inp1.charAt(0));
        int m = Character.getNumericValue(inp1.charAt(2));
        
        for (int i = 0; i < m; i++) {
            String inp2 = scanner.nextLine();
            int s = Character.getNumericValue(inp2.charAt(0));
            char c = inp2.charAt(2);
            
            if (tbl[s - 1] == ' ') {
                if ((c == '0') && (s == 1) && (n > 1)) {
                    swErr = "1";
                } else {
                    tbl[s - 1] = c;
                }
            } else {
                if (tbl[s - 1] != c) {
                    swErr = "1";
                }
            }
        }
        
        // Output result
        if ("1".equals(swErr)) {
            System.out.println("-1");
        } else {
            if (n > 1 && tbl[0] == ' ') {
                tbl[0] = '1';
            }
            
            StringBuilder outN = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (tbl[i] == ' ') {
                    tbl[i] = '0';
                }
                outN.append(tbl[i]);
            }
            
            System.out.println(outN.toString());
        }
        
        scanner.close();
    }
}
```