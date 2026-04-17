```java
import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] parts = s.split("\\s+");
        String a = parts[0].trim();
        String b = parts[1].trim();
        s = a + b;
        long v = Long.parseLong(s);
        String disp = "No";

        for (int i = 1; i < 1000; i++) {
            long r = (long) i * i;
            if (r == v) {
                disp = "Yes";
                break;
            }
        }

        System.out.println(disp);
    }
}
```