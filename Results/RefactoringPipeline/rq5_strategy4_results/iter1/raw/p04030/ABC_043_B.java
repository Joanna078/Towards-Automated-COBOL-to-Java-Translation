```java
import java.util.Scanner;

public class ABC_043_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of length up to 10: ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.length() > 10) {
            System.out.println("Input exceeds maximum length of 10 characters.");
            return;
        }

        char[] s1 = input.toCharArray();
        char[] ans1 = new char[10];
        int now = 0;

        for (char c : s1) {
            if (c == 'B') {
                if (now != 0) {
                    ans1[--now] = ' ';
                }
            } else {
                ans1[now++] = c;
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