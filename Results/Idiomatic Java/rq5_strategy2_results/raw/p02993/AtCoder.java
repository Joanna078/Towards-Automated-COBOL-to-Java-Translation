```java
import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        scanner.close();

        long B = A % 10;
        A /= 10;
        long C = A % 10;
        A /= 10;
        long D = A % 10;
        A /= 10;
        long E = A;

        if (B == C || C == D || E == D) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}
```