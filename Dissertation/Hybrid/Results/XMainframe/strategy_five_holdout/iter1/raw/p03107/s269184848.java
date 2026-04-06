```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int rcnt = 0;
        int bcnt = 0;
        int len = 0;
        int ans = 0;
        StringBuilder oAns = new StringBuilder();
        for (int i = 0; i < s.length() && i < 100000; i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                rcnt++;
            } else if (ch == '1') {
                bcnt++;
            } else if (ch == ' ') {
                len = i;
                break;
            }
        }
        if (rcnt > bcnt) {
            ans = len - (rcnt - bcnt);
        } else {
            ans = len - (bcnt - rcnt);
        }
        oAns.append(String.format("%05d", ans));
        System.out.println(oAns.toString());
    }
}
```