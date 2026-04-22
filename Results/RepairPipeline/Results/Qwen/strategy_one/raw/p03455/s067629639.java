```java
import java.util.Scanner;

public class ABC_086_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int maxlen = 2;
        int cur = 0;
        int i = 0;
        int j;
        int len;

        String[] ab = new String[maxlen];

        while (i < maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            ab[i] = inp.substring(cur, cur + len);

            cur = j + 1;
            i++;
        }

        int x = Integer.parseInt(ab[0]) * Integer.parseInt(ab[1]);
        int d = x % 2;

        if (d == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```