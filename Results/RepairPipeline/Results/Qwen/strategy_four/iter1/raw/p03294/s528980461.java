```java
import java.util.Scanner;

public class ABC_103_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        long sm = 0;
        int maxlen = n; // Corrected to use n instead of 3000
        int cur = 1;
        int i = 1;
        
        while (i <= maxlen) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            
            int len = j - cur;
            if (len > 0) { // Check to avoid parsing empty string
                String a = inp.substring(cur - 1, cur - 1 + len);
                int numA = Integer.parseInt(a) - 1;
                sm += numA;
            }
            
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