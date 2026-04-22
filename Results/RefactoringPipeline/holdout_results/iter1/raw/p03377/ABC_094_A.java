```java
import java.util.Scanner;

public class ABC_094_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        int maxlen = 3;
        int cur = 0;
        int[] abx = new int[3];
        int i = 0;

        for (int n = 0; n < maxlen; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                abx[i] = Integer.parseInt(inp.substring(cur, j));
                cur = j + 1;
                i++;
            }
        }

        if (i >= 3 && abx[0] <= abx[2] && abx[2] <= abx[0] + abx[1]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```