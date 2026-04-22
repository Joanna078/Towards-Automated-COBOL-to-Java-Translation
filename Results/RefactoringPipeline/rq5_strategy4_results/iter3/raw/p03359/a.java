```java
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        int i = 0;
        while (i < inp.length() && !Character.isWhitespace(inp.charAt(i))) {
            i++;
        }
        i--;

        int a = Integer.parseInt(inp.substring(0, i).isEmpty() ? "0" : inp.substring(0, i));

        int b = Integer.parseInt(inp.substring(i + 2, Math.min(i + 4, inp.length())).isEmpty() ? "0" : inp.substring(i + 2, Math.min(i + 4, inp.length())));

        if (a > b) {
            a--;
        }

        int d = a < 10 ? a : a;
        System.out.println(d);
    }
}
```