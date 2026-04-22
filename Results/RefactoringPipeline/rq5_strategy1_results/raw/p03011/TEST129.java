```java
import java.util.Scanner;

public class TEST129 {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int p = 0;
    private int q = 0;
    private int r = 0;
    private int a1 = 0;
    private int a2 = 0;
    private int a3 = 0;
    private int ans = 0;

    public static void main(String[] args) {
        TEST129 test = new TEST129();
        test.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split(" ");
        if (parts.length >= 3) {
            p = Integer.parseInt(parts[0]);
            q = Integer.parseInt(parts[1]);
            r = Integer.parseInt(parts[2]);

            computeAndDisplay();
        } else {
            System.out.println("Invalid input. Please enter three numbers separated by spaces.");
        }
    }

    private void computeAndDisplay() {
        a1 = p + q;
        a2 = q + r;
        a3 = p + r;

        if (a1 < a2 && a1 < a3) {
            ans = a1;
        } else if (a2 < a1 && a2 < a3) {
            ans = a2;
        } else if (a3 < a1 && a3 < a2) {
            ans = a3;
        }

        System.out.println("Smallest sum: " + ans);
    }
}
```