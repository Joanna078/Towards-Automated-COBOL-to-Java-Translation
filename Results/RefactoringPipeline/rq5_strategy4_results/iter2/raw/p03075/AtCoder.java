```java
import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();
        long E = scanner.nextLong();
        long F = scanner.nextLong();

        if (E - A > F) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }

        scanner.close();
    }
}
```