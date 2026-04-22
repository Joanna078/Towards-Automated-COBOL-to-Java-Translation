```java
import java.util.Scanner;

public class ABC_061_A {

    private int returnCode;
    private String inp;
    private int a;
    private int b;
    private int c;

    public static void main(String[] args) {
        ABC_061_A program = new ABC_061_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        String[] parts = inp.split("\\s+");
        if (parts.length >= 3) {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            c = Integer.parseInt(parts[2]);
        } else {
            System.out.println("Invalid input. Please enter three numbers separated by spaces.");
            return;
        }

        if (a <= c && c <= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```