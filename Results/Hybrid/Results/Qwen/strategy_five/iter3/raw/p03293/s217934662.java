```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input handling
        String inp = scanner.nextLine();
        char[] s = new char[100];
        for (int i = 0; i < inp.length() && i < 100; i++) {
            s[i] = inp.charAt(i);
        }

        inp = scanner.nextLine();
        char[] t = new char[100];
        for (int i = 0; i < inp.length() && i < 100; i++) {
            t[i] = inp.charAt(i);
        }

        int idx = 0;
        while (idx < 100 && s[idx] != ' ') {
            idx++;
        }

        int cnt = 0;
        while (cnt < idx && !new String(s).equals(new String(t))) {
            char[] wkS = new char[100];
            System.arraycopy(s, 0, wkS, 0, 100);
            if (idx < 100) { // Ensure idx is within bounds
                wkS[idx] = s[0];
            }
            System.arraycopy(wkS, 0, s, 0, 100);
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