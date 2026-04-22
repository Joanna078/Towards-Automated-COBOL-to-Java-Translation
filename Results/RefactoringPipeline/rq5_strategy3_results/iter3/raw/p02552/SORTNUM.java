```java
import java.util.Scanner;

public class SortNum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();

            if (x == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```