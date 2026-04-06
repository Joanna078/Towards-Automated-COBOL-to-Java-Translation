```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int wVal;
        int wShow;
        int rem;
        String ans = "No";
        int w_a;
        int w_b;
        for (int idx = 0; idx < 3; idx++) {
            w_a = Character.getNumericValue(s.charAt(idx));
            w_b = Character.getNumericValue(s.charAt((idx + 2) % 3));
            wVal = w_a * w_b * (idx + 1);
            wShow = wVal / 2;
            rem = wVal % 2;
            if (rem == 1) {
                ans = "Yes";
                break; // Exit the loop once "Yes" is found
            }
        }
        System.out.println(ans);
    }
}
```