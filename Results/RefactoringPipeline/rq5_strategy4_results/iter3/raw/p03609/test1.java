```java
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        int temp1 = input.indexOf(' ');
        if (temp1 == -1) temp1 = input.length();
        long A = Long.parseLong(input.substring(0, temp1));

        int temp2 = input.indexOf(' ', temp1 + 1);
        if (temp2 == -1) temp2 = input.length();
        long B = Long.parseLong(input.substring(temp1 + 2, temp2));

        if (A >= B) {
            A -= B;
        } else {
            A = 0;
        }

        System.out.printf("%09d%n", A);
    }
}
```