```java
import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int ans = 0;

            for (int i = a; i <= b; i++) {
                String iStr = String.valueOf(i);
                if (iStr.length() == 5 && iStr.charAt(0) == iStr.charAt(4) && iStr.charAt(1) == iStr.charAt(3)) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
```