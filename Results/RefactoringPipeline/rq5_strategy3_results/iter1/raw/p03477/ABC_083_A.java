```java
import java.util.Scanner;

public class ABC_083_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);
        int D = Integer.parseInt(parts[3]);

        int sumAB = A + B;
        int sumCD = C + D;

        if (sumAB < sumCD) {
            System.out.println("Right");
        } else if (sumAB == sumCD) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
    }
}
```