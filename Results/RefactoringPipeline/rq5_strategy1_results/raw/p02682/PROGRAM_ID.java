```java
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private String ln = "";
    private int A = 0;
    private int B = 0;
    private int C = 0;
    private int K = 0;
    private int ans = 0;

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values: ");
        ln = scanner.nextLine();
        scanner.close();

        String[] parts = ln.split("\\s+");
        if (parts.length >= 4) {
            A = Integer.parseInt(parts[0]);
            B = Integer.parseInt(parts[1]);
            C = Integer.parseInt(parts[2]);
            K = Integer.parseInt(parts[3]);
        }

        if (K <= A) {
            ans = K;
        } else if (K <= A + B) {
            ans = A;
        } else {
            ans = A - (K - (A + B));
        }

        System.out.println("Result: " + ans);
    }
}
```