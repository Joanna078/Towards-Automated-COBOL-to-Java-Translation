```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int temp1 = 0;
        while (temp1 < s.length() && s.charAt(temp1) != ' ') {
            temp1++;
        }
        int A = Integer.parseInt(s.substring(0, temp1));
        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < s.length() && s.charAt(temp2) != ' ') {
            temp2++;
        }
        int N = temp2 - temp1;
        int B = Integer.parseInt(s.substring(temp1, temp1 + N)); // Corrected substring length
        s = sc.nextLine();
        if (B > 0 && B <= s.length()) { // Check if B is within the valid range
            char ch = s.charAt(B - 1);
            if (ch == 'A') {
                s = s.substring(0, B - 1) + 'a' + s.substring(B);
            } else if (ch == 'B') {
                s = s.substring(0, B - 1) + 'b' + s.substring(B);
            } else if (ch == 'C') {
                s = s.substring(0, B - 1) + 'c' + s.substring(B);
            }
        }
        System.out.println(s);
    }
}
```