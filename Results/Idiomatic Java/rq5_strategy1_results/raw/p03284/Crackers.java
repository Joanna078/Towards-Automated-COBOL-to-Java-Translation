```java
import java.util.Scanner;

public class Crackers {

    private boolean initialized = false;
    private int returnCode;
    private String inp;
    private int inN;
    private int inK;
    private int maisu;
    private int amari;

    public static void main(String[] args) {
        Crackers crackers = new Crackers();
        crackers.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();

        String[] parts = inp.split(" ");
        inN = Integer.parseInt(parts[0]);
        inK = Integer.parseInt(parts[1]);

        maisu = inN / inK;
        amari = inN % inK;

        if (amari == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
```