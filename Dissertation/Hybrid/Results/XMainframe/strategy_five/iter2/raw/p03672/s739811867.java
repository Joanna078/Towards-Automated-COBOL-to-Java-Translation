```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int l = len - 1;
        int i = l;
        boolean flag = true;
        while (i >= 1) {
            if (i % 2 == 1) {
                flag = false;
            } else {
                int k = i / 2;
                int ini = k;
                String left = s.substring(0, ini);
                String right = s.substring(ini, ini + k);
                if (!left.equals(right)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                break;
            }
            i--;
        }
        System.out.println(flag ? "Yes" : "No");
    }
}
```