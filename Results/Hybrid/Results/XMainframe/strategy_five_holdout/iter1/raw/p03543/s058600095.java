```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = N;
        int remainder = D % 10;
        int count = 1;
        D /= 10; // Move D to the next digit after initializing remainder
        while (D != 0) {
            int currentRemainder = D % 10;
            if (currentRemainder == remainder) {
                count++;
            }
            remainder = currentRemainder; // Update remainder for the next iteration
            D /= 10;
        }
        System.out.println(count >= 3 ? "Yes" : "No");
    }
}
```