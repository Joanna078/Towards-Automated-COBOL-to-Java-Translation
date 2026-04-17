```java
import java.util.Scanner;

public class A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "         ";
    private int a = 0;
    private int b = 0;
    private int d = 0;
    private int i = 0;

    public static void main(String[] args) {
        A program = new A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        if (!initialized) {
            initialized = true;
        }

        mainSection();
    }

    private void mainSection() {
        i = 1;
        while (i <= inp.length() && inp.charAt(i - 1) != ' ') {
            i++;
        }

        a = i;
        i++;

        if (a > b) {
            a++;
        }

        if (a < 10) {
            d = a;
            System.out.println(d);
        } else {
            System.out.println(a);
        }

        System.exit(returnCode);
    }
}
```