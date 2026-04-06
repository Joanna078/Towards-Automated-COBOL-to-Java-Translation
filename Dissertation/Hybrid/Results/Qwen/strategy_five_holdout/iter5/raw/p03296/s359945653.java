```java
import java.util.Scanner;

public class ABC_026_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data Division
        int maxA = 999;
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String inp = scanner.nextLine();
        int maxlen = n;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        StringBuilder ans = new StringBuilder();

        int sm = 0;
        int cnt = 1;
        int bk = maxA;

        while (i <= maxlen) {
            j = cur;
            while (j <= maxlen && j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }

            len = j - cur;
            if (len > 0) { // Ensure len is positive to avoid substring issues
                String a = inp.substring(cur - 1, j - 1);

                if (bk != Integer.parseInt(a)) {
                    cnt /= 2;
                    sm += cnt;
                    cnt = 1;
                    bk = Integer.parseInt(a);
                } else {
                    cnt++;
                }
            }

            cur = j + 1;
            i++;
        }

        cnt /= 2;
        sm += cnt;

        ans.append(sm);

        // Unans Section
        String[] parts = ans.toString().split(" ");
        ans.setLength(0); // Clear the StringBuilder
        for (String part : parts) {
            if (!part.isEmpty()) {
                ans.append(part);
            }
        }

        System.out.println(ans.toString());
    }
}
```