```java
import java.util.Scanner;

public class ABC_050_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = " ".repeat(23);
    private String a = "0".repeat(10);
    private char op = ' ';
    private String b = "0".repeat(10);
    private String ans = " ".repeat(10);
    private String zs = " ".repeat(11);
    private char dummy = ' ';

    public static void main(String[] args) {
        new ABC_050_A().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        String[] parts = inp.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Invalid input format.");
            return;
        }

        a = parts[0];
        op = parts[1].charAt(0);
        b = parts[2];

        if (op == '+') {
            ans = add(a, b);
        } else if (op == '-') {
            ans = subtract(a, b);
        } else {
            System.out.println("Invalid operator.");
            return;
        }

        System.out.println("Result: " + ans);
    }

    private String add(String num1, String num2) {
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);
        return String.valueOf(n1 + n2);
    }

    private String subtract(String num1, String num2) {
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);
        return String.valueOf(n1 - n2);
    }
}
```