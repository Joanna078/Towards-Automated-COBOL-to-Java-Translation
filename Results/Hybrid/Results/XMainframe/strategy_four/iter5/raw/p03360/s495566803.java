```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int k = sc.nextInt();
        
        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int len = 0;
        
        int mx = 0;
        int tmp = 0;
        String ans = "";
        String zs = "000000";
        
        int[] abc = new int[4]; // Adjusted size to accommodate 3 occurrences
        
        for (int m = 0; m < maxlen; m++) {
            int j = cur;
            while (j <= inp.length() && !inp.substring(j - 1, j).equals(" ")) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                abc[i] = Integer.parseInt(inp.substring(cur - 1, cur + len - 1));
            }
            cur = j + 1;
            i++;
        }
        
        tmp = abc[1] + abc[2] + abc[3];
        mx = Math.max(Math.max(abc[1], abc[2]), abc[3]);
        
        tmp -= mx;
        mx *= Math.pow(2, k);
        tmp += mx;
        
        zs = String.format("%06d", tmp);
        
        String dummy = "";
        ans = zs.substring(zs.indexOf(' ') + 1);
        
        System.out.println(ans.trim());
    }
}
```