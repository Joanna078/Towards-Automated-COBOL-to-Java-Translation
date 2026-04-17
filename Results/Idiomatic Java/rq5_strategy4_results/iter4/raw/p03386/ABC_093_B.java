```java
import java.util.Scanner;

public class ABC_093_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().trim();
        scanner.close();

        int maxlen = 3;
        int cur = 0;
        int i = 0;
        int[] abk = new int[3];
        int[] a = new int[100];
        int[] b = new int[100];
        int idx = 0;
        int idx2 = 0;

        // Extract numbers from input
        for (int j = 0; j < maxlen; j++) {
            StringBuilder numStr = new StringBuilder();
            while (cur < inp.length() && inp.charAt(cur) != ' ') {
                numStr.append(inp.charAt(cur));
                cur++;
            }
            if (numStr.length() > 0) {
                abk[i] = Integer.parseInt(numStr.toString());
                i++;
            }
            if (cur < inp.length()) cur++; // Skip space
        }

        // Populate array A
        idx = 0;
        for (int m = abk[0]; m <= abk[1]; m++) {
            if (m <= abk[2]) {
                a[idx++] = m;
            } else {
                break;
            }
        }

        // Display elements of A
        for (int m = 0; m < idx; m++) {
            System.out.println(a[m]);
        }

        // Populate array B in reverse order
        idx2 = 0;
        for (int p = abk[1]; p >= abk[1] - abk[2] + 1; p--) {
            if (p < a[idx - 1]) {
                b[idx2++] = p;
            } else {
                break;
            }
        }

        // Display elements of B
        for (int p = idx2 - 1; p >= 0; p--) {
            System.out.println(b[p]);
        }
    }
}
```