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

        if (i > 0) { // Ensure there is at least one character before the space
            i--; // Corrected: Decrement i by 1 to get the last valid index before space
            a = Integer.parseInt(inp.substring(0, i));
            i += 2; // Corrected: Increment i by 2 to move past the space and get the next two digits
            if (i + 2 <= inp.length()) { // Ensure there are at least two characters after the space
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
            } else {
                System.out.println("Invalid input format");
            }
        } else {
            System.out.println("Invalid input format");
        }
    }
}
```