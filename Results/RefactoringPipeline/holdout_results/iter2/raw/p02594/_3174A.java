```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int x = scanner.nextInt();
            
            if (x >= 30) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```