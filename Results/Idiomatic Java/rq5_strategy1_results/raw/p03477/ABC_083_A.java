```java
import java.util.Scanner;

public class ABC_083_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp;
    private int a;
    private int b;
    private int c;
    private int d;

    public static void main(String[] args) {
        ABC_083_A program = new ABC_083_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        if (parts.length != 4) {
            System.out.println("Invalid input. Please enter four numbers separated by spaces.");
            return;
        }

        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            c = Integer.parseInt(parts[2]);
            d = Integer.parseInt(parts[3]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
            return;
        }

        int sum1 = a + b;
        int sum2 = c + d;

        if (sum1 < sum2) {
            System.out.println("Right");
        } else if (sum1 == sum2) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
    }
}
```