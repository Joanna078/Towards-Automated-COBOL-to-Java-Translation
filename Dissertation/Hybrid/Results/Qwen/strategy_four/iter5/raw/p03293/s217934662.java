```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input handling
        String inp = scanner.nextLine();
        char[] s = new char[100];
        System.arraycopy(inp.toCharArray(), 0, s, 0, Math.min(inp.length(), 100));

        inp = scanner.nextLine();
        char[] t = new char[100];
        System.arraycopy(inp.toCharArray(), 0, t, 0, Math.min(inp.length(), 100));

        int idx = 0;
        while (idx < s.length && s[idx] != ' ') {
            idx++;
        }

        int cnt = 0;
        while (cnt < idx && !new String(s).equals(new String(t))) {
            char[] wkS = new char[100];
            System.arraycopy(s, 0, wkS, 0, s.length);
            if (idx < s.length) {
                wkS[idx] = s[0];
            }
            System.arraycopy(wkS, 0, s, 0, s.length);
            cnt++;
        }

        if (new String(s).equals(new String(t))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```