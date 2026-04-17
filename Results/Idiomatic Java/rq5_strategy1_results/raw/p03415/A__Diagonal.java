```java
import java.util.Scanner;

public class Diagonal {

    private int returnCode;
    private String c1 = "   ";
    private String c2 = "   ";
    private String c3 = "   ";

    public static void main(String[] args) {
        Diagonal diagonal = new Diagonal();
        diagonal.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT
        System.out.print("Enter C1: ");
        c1 = scanner.nextLine().substring(0, Math.min(c1.length(), scanner.nextLine().length()));

        System.out.print("Enter C2: ");
        c2 = scanner.nextLine().substring(0, Math.min(c2.length(), scanner.nextLine().length()));

        System.out.print("Enter C3: ");
        c3 = scanner.nextLine().substring(0, Math.min(c3.length(), scanner.nextLine().length()));

        // DISPLAY
        System.out.println(c1.charAt(0) + c2.charAt(1) + c3.charAt(2));

        // STOP
        System.exit(returnCode);
    }
}
```