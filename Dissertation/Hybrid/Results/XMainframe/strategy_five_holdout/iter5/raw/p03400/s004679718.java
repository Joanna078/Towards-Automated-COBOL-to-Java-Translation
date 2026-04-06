```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.next();
        int[] DX = new int[2];
        int cur = 0;
        int len = 0;
        int i = 0;
        for (int j = 0; j < line.length(); j++) {
            if (line.charAt(j) == ' ') {
                len = j - cur;
                if (len > 0) {
                    DX[i] = Integer.parseInt(line.substring(cur, cur + len).trim());
                    i++;
                }
                cur = j + 1;
            }
        }
        if (cur < line.length()) {
            DX[i] = Integer.parseInt(line.substring(cur).trim());
        }
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int sm = 0;
        for (int p = 0; p <= DX[0]; p++) {
            for (int q = 0; q < N; q++) {
                if (p == 0 || p % A[q] == 0) {
                    sm++;
                }
            }
        }
        sm += DX[1];
        String ZS = String.format("%06d", sm);
        String ans = "";
        for (char c : ZS.toCharArray()) {
            if (c != ' ') {
                ans += c;
            }
        }
        System.out.println(ans);
    }
}
```