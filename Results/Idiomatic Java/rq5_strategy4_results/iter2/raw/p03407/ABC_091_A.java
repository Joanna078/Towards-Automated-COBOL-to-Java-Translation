```java
import java.util.Scanner;

public class ABC_091_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().trim();
        scanner.close();

        int[] abc = new int[3];
        int maxlen = 3;
        int cur = 0;
        int i = 0;

        for (int n = 0; n < maxlen && i < 3; n++) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                abc[i] = Integer.parseInt(inp.substring(cur, j));
                cur = j + 1;
                i++;
            }
        }

        int tmp = abc[0] + abc[1];

        if (tmp < abc[2]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```