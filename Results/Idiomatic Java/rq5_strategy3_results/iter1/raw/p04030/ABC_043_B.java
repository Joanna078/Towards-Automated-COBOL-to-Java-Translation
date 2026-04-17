```java
import java.util.Scanner;

public class ABC_043_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char[] s1 = input.toCharArray();
        char[] ans1 = new char[10];
        int len = s1.length;
        int now = 0;

        for (int i = 0; i < len; i++) {
            if (s1[i] == 'B') {
                if (now != 0) {
                    ans1[now - 1] = ' ';
                    now--;
                }
            } else {
                if (now < 10) {
                    ans1[now] = s1[i];
                    now++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < now; i++) {
            result.append(ans1[i]);
        }

        System.out.println(result.toString());
    }
}
```