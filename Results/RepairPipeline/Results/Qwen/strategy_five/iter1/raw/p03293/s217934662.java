```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input handling
        String inp = scanner.nextLine();
        char[] s = inp.toCharArray();

        inp = scanner.nextLine();
        char[] t = inp.toCharArray();

        int idx = 0;
        while (idx < s.length && s[idx] != ' ') {
            idx++;
        }

        int cnt = 0;
        while (cnt < idx && !new String(s).equals(new String(t))) {
            char[] wkS = new char[s.length];
            System.arraycopy(s, 0, wkS, 0, s.length);
            if (idx < s.length) { // Ensure idx is within bounds
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