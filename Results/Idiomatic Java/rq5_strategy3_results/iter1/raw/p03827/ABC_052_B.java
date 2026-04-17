```java
import java.util.Scanner;

public class ABC_052_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept S1
        String S1 = scanner.nextLine();

        int tmp = 0;
        int mx = 0;

        for (int i = 0; i < N; i++) {
            char ch = S1.charAt(i);
            if (ch == 'I') {
                tmp++;
            } else {
                tmp--;
            }
            mx = Math.max(mx, tmp);
        }

        String ans = Integer.toString(mx);

        // Display ans
        System.out.println(ans);

        scanner.close();
    }
}
```