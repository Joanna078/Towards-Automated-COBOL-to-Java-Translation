```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first input
        String inp = scanner.nextLine();
        char[] s = inp.toCharArray();

        // Read second input
        String t = scanner.nextLine();

        int idx = 0;
        while (idx < s.length && s[idx] != ' ') {
            idx++;
        }

        int cnt = 0;
        while (!(new String(s).equals(t) || cnt == idx)) {
            char[] wkS = s.clone();
            if (idx < s.length) {
                s[idx] = inp.charAt(0);
            }
            s = wkS;
            cnt++;
        }

        if (new String(s).equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```