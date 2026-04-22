```java
import java.util.Scanner;

public class ABC_026_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine();

        int maxlen = N;
        int bk = 999;
        int cnt = 1;
        int sm = 0;
        int cur = 0;

        while (cur < INP.length()) {
            int j = cur;
            while (j < INP.length() && INP.charAt(j) != ' ') {
                j++;
            }

            int len = j - cur;
            String a = INP.substring(cur, cur + len);

            if (!a.equals(String.valueOf(bk))) {
                sm += cnt / 2;
                cnt = 1;
                bk = Integer.parseInt(a);
            } else {
                cnt++;
            }

            cur = j + 1;
        }

        sm += cnt / 2;
        String ZS = String.valueOf(sm);

        // UNANS SECTION
        String[] parts = ZS.split("\\s+");
        String ans = parts[parts.length - 1];

        // Display ans
        System.out.println(ans);
    }
}
```