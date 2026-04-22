```java
import java.util.*;

public class Atcoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        
        if (numbers.length < 3) {
            System.out.println("Input must contain at least three numbers.");
            return;
        }

        int a1 = Integer.parseInt(numbers[0]);
        int a2 = Integer.parseInt(numbers[1]);
        int a3 = Integer.parseInt(numbers[2]);

        a2 = a2 + (a1 * 3);
        int g = a2 / 2;

        System.out.println(g);
    }
}
```