```java
import java.util.Arrays;

public class ABC_096_B {
    public static void main(String[] args) {
        String inp = "example"; // Simulating input
        int k = 2; // Simulating input

        int[] abc = new int[3];
        int cur = 0;
        int i = 0;
        int len;
        int mx = Integer.MIN_VALUE;
        int tmp = 0;
        StringBuilder ans = new StringBuilder();
        String zs;

        while (cur < inp.length()) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0 && i < 3) { // Ensure there's a valid number to parse
                abc[i] = Integer.parseInt(inp.substring(cur, j));
            }
            cur = j + 1;
            i++;
        }

        tmp = abc[0] + abc[1] + abc[2];
        mx = Math.max(Math.max(abc[0], abc[1]), abc[2]);
        tmp -= mx;
        mx *= (1 << k);
        tmp += mx;

        zs = String.format("%06d", tmp);

        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }

        System.out.println(ans.toString());
    }
}
```