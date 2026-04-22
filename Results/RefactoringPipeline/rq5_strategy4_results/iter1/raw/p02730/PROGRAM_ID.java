```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        scanner.close();

        int n = s.length();
        StringBuilder cur = new StringBuilder(n);
        StringBuilder x = new StringBuilder(n);

        reverseString(s, cur);

        if (s.equals(cur.toString())) {
            cur.setLength(0);
            int m = n / 2;
            x.append(s.substring(0, m));
            reverseString(x.toString(), cur);

            if (x.toString().equals(cur.toString())) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }

    private static void reverseString(String s, StringBuilder sb) {
        sb.setLength(0);
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
    }
}
```