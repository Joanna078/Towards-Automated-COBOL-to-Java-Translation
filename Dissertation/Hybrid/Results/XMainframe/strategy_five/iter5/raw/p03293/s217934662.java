```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        char s1 = inp.charAt(0);
        String s9 = inp.substring(1); // Corrected substring index
        char[] s99 = s9.toCharArray();

        inp = scanner.nextLine();
        String t = inp;

        int idx = 0;
        while (idx < s99.length && s99[idx] != ' ') { // Added length check
            idx++;
        }

        char[] wk_s100 = new char[100];
        int cnt = 0;
        while (cnt < idx) { // Removed t.equals(s9) condition
            System.arraycopy(s9.toCharArray(), 0, wk_s100, 0, s9.length()); // Corrected arraycopy indices
            wk_s100[cnt] = s1; // Changed index from idx to cnt
            s9 = new String(wk_s100);
            cnt++;
        }

        if (t.equals(s9)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```