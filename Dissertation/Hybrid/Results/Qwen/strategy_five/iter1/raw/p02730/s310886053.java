```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        int m = n;
        String cur = reverseString(s);
        if (s.equals(cur)) {
            cur = " ".repeat(n);
            m /= 2;
            String x = s.substring(0, m);
            x = reverseString(x);
            if (x.equals(cur)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
```