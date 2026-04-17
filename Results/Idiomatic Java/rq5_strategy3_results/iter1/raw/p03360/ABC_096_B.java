```java
import java.util.Scanner;

public class ABC_096_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter input string (max 10 characters): ");
        String inp = scanner.nextLine().substring(0, 10);

        System.out.print("Enter integer K: ");
        int k = scanner.nextInt();

        // Process input
        int[] abc = new int[3];
        int cur = 0;
        int i = 0;

        for (int maxlen = 3; maxlen > 0; maxlen--) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                abc[i] = Integer.parseInt(inp.substring(cur, cur + len));
                cur = j + 1;
                i++;
            }
        }

        // Calculate sum and max
        int sum = abc[0] + abc[1] + abc[2];
        int max = Math.max(abc[0], Math.max(abc[1], abc[2]));

        // Adjust sum
        sum -= max;
        sum += max * (1 << k);

        // Convert result to string
        String zs = String.format("%05d", sum);

        // Extract answer
        String ans = zs.substring(1);

        // Display result
        System.out.println(ans);
    }
}
```