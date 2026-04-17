```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int num = String.valueOf(i).length();
            int qt = num / 2;
            int rm = num % 2;

            if (rm == 1) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
```