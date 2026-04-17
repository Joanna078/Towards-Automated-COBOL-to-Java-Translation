```java
import java.util.Scanner;

public class ABC_043_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String s1 = "          ";
    private String ans1 = "          ";
    private int i = 0;
    private int len = 0;
    private int now = 0;

    public static void main(String[] args) {
        new ABC_043_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s1 = scanner.nextLine().substring(0, Math.min(s1.length(), s1.length()));
        scanner.close();

        len = s1.length();
        now = 0;

        for (i = 0; i < len; i++) {
            char ch = s1.charAt(i);
            if (ch == 'B') {
                if (now != 0) {
                    ans1 = ans1.substring(0, now - 1) + ' ' + ans1.substring(now);
                    now--;
                }
            } else {
                now++;
                ans1 = ans1.substring(0, now - 1) + ch + ans1.substring(now);
            }
        }

        System.out.println(ans1.trim());
    }
}
```