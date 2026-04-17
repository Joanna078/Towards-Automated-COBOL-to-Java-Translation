```java
import java.util.Scanner;

public class ABC_078_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three characters: ");
        String inp = scanner.nextLine().trim();

        if (inp.length() != 3) {
            System.out.println("Invalid input. Please enter exactly three characters.");
            return;
        }

        char x = inp.charAt(0);
        char y = inp.charAt(1);

        if (x < y) {
            System.out.println("<");
        } else if (x == y) {
            System.out.println("=");
        } else {
            System.out.println(">");
        }
    }
}
```