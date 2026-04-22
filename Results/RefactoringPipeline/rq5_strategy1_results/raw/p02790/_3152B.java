```java
import java.util.Scanner;

public class Main {

    private int returnCode;
    private String inp;
    private char a;
    private char b;
    private char n;
    private int i;
    private StringBuilder out;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        if (inp.length() < 2) {
            System.out.println("Invalid input");
            return;
        }

        a = inp.charAt(0);
        b = inp.charAt(1);

        if (a <= b) {
            n = b;
        } else {
            n = a;
            a = b;
        }

        out = new StringBuilder();
        for (i = 1; i <= Character.getNumericValue(n); i++) {
            out.append(a);
        }

        System.out.println(out.toString());
    }
}
```