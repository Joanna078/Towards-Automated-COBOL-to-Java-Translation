```java
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private String ln = "";
    private int A = 0;
    private int B = 0;
    private int K = 0;
    private int mna = 0;
    private int mnb = 0;
    private String ans = "";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for A, B, K separated by spaces: ");
        ln = scanner.nextLine();
        String[] parts = ln.split("\\s+");
        if (parts.length == 3) {
            try {
                A = Integer.parseInt(parts[0]);
                B = Integer.parseInt(parts[1]);
                K = Integer.parseInt(parts[2]);
                mainSection();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
            }
        } else {
            System.out.println("Please enter exactly three values.");
        }
    }

    private void mainSection() {
        mna = Math.min(A, K);
        A -= mna;
        mna = K - mna;
        mnb = Math.min(B, mna);
        B -= mnb;
        String zsa = String.format("%019d", A);
        String zsb = String.format("%019d", B);
        ans = zsa.trim() + " " + zsb.trim();
        System.out.println(ans);
    }
}
```