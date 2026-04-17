```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for A B C X Y: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        if (parts.length != 5) {
            System.out.println("Invalid input. Please enter exactly five values.");
            return;
        }

        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);
        int X = Integer.parseInt(parts[3]);
        int Y = Integer.parseInt(parts[4]);

        long MAX = (long) A * X + (long) B * Y;
        int BIG = X >= Y ? A : B;
        int SA = Math.abs(X - Y);

        long CNT;
        if (A + B <= C * 2) {
            CNT = MAX;
        } else {
            CNT = MAX - (A + B - C * 2) * Math.min(X, Y);
            if (BIG > C * 2) {
                CNT -= (BIG - C * 2) * SA;
            }
        }

        System.out.printf("%08d%n", CNT);
    }
}
```