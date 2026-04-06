```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from keyboard
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        
        long inf = 1000000000000000000L;
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        long ans = 1;
        char[] zs = new char[36];
        int flg = 0;
        int[] a = new int[100000];

        // Process input
        while (cur <= input.length()) {
            j = cur;
            while (j <= input.length() && j - 1 < input.length() && input.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                a[i] = Integer.parseInt(input.substring(cur - 1, j - 1));
                if (a[i] == 0) {
                    flg = 1;
                    break;
                }
                cur = j + 1;
                i++;
            } else {
                break;
            }
        }

        if (flg == 1) {
            System.out.println("ZERO");
        } else {
            for (int k = 1; k <= i - 1; k++) {
                if ((long) a[k] > inf) {
                    flg = 1;
                    break;
                }
                ans *= a[k];
                if ((long) ans > inf) {
                    flg = 1;
                    break;
                }
            }
            if (flg == 1) {
                System.out.println("-1");
            } else {
                System.out.println(String.format("%d", ans).trim());
            }
        }
    }
}
```