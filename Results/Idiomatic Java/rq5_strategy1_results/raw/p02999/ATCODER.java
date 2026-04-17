```java
import java.util.Scanner;

public class ATCODER {

    private boolean initialized = false;
    private int returnCode = 0;
    private String indata = "";
    private String a1 = "0";
    private String a2 = "0";

    public static void main(String[] args) {
        new ATCODER().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split("\\s+");
        if (parts.length >= 2) {
            a1 = parts[0];
            a2 = parts[1];
        }

        if (a1.compareTo(a2) < 0) {
            System.out.println("0");
        } else {
            System.out.println("10");
        }
    }
}
```