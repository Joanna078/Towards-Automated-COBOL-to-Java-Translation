```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int a = 0;
        int b = 0;
        int d = 0;
        int i = 0;

        while (i < inp.length() && inp.charAt(i) != ' ') {
            i++;
        }

        a = Integer.parseInt(inp.substring(0, i));
        i++; // Corrected: Increment i by 1 instead of 2
        b = Integer.parseInt(inp.substring(i, i + 2));

        if (a > b) {
            a--;
        }

        if (a < 10) {
            d = a;
            System.out.println(d);
        } else {
            System.out.println(a);
        }
    }
}
```