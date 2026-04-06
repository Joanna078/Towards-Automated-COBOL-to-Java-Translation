```java
import java.util.Arrays;
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int k = 1;
        int len = 0;
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int num = 4;
        String ans = "";
        int idx = 0;
        int zs = 0;
        String S = "";
        int[] C = new int[num];
        Arrays.fill(C, 0);
        String j1 = "AC WA TLERE";
        String[] j = j1.split(" ");
        String mul = " x ";

        while (N >= i) {
            S = scanner.nextLine();
            int ix = 0;
            while (ix < 4) {
                boolean found = false;
                for (; ix < 4; ix++) {
                    if (S.equals(j[ix])) {
                        idx = ix + 1;
                        C[idx] += 1;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    ix++;
                }
            }
            i++;
        }

        i = 1;
        while (num >= i) {
            ans = "";
            zs = C[i - 1];
            ans = j[i - 1].trim() + mul + String.format("%d", zs).trim();
            System.out.println(ans.trim());
            i++;
        }
        scanner.close();
    }
}
```