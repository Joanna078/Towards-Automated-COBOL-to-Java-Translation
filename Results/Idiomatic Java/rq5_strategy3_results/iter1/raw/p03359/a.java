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

        int a = Integer.parseInt(inp.substring(0, i + 1));
        int b = Integer.parseInt(inp.substring(i + 3, i + 5));

        if (a > b) {
            a--;
        }

        if (a < 10) {
            System.out.println(a);
        } else {
            System.out.println(a);
        }
    }
}
```