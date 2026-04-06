```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        if (s.charAt(0) == 'A' && len >= 5) {
            int cnt = 0;
            int idx = -1;
            for (int i = 2; i < len - 1; i++) {
                if (s.charAt(i) == 'C') {
                    cnt++;
                    idx = i;
                }
            }
            if (cnt == 1) {
                boolean flg = false;
                for (int i = 1; i < len; i++) {
                    char c = s.charAt(i);
                    if (i != idx && !(c >= 'a' && c <= 'z')) {
                        flg = true;
                    }
                }
                if (flg) {
                    System.out.println("WA");
                } else {
                    System.out.println("AC");
                }
            } else {
                System.out.println("WA");
            }
        } else {
            System.out.println("WA");
        }
    }
}
```