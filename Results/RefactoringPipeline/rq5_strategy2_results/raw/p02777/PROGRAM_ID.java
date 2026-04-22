```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept LN
        String ln = scanner.nextLine();
        String[] parts = ln.split("\\s+");
        String S = parts[0];
        String T = parts[1];

        // Accept LN again
        ln = scanner.nextLine();
        parts = ln.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);

        // Accept U
        String U = scanner.nextLine();

        // Adjust A or B based on comparison
        if (S.equals(U)) {
            A--;
        } else {
            B--;
        }

        // Convert A to string
        String ans = String.format("%02d", A);

        // Convert B to string
        String z = String.format("%02d", B);

        // Display result
        System.out.println(z + " " + ans);
    }
}
```