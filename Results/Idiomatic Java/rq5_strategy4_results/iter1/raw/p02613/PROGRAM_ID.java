```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        // Initialize variables
        int[] C = new int[4];
        String[] j = {"AC", "WA", "TLERE"};
        String mul = " x ";

        // Process input
        for (int i = 0; i < N; i++) {
            System.out.print("Enter string: ");
            String S = scanner.next();

            for (int ix = 0; ix < j.length; ix++) {
                if (S.equals(j[ix])) {
                    C[ix]++;
                }
            }
        }

        // Display results
        for (int i = 0; i < j.length; i++) {
            if (C[i] > 0) {
                System.out.println(j[i] + mul + C[i]);
            }
        }

        scanner.close();
    }
}
```