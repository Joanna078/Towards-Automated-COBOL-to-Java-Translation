```java
import java.util.Scanner;

public class ABC_076_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input values for R and G
        System.out.print("Enter value for R: ");
        int R = scanner.nextInt();

        System.out.print("Enter value for G: ");
        int G = scanner.nextInt();

        // Perform operations as per COBOL logic
        R = G - R;
        R += G;

        int ZS = R;

        // Convert ZS to string and extract the first character
        String ans = Integer.toString(ZS);
        if (ans.length() > 0) {
            ans = ans.substring(0, 1);
        }

        // Display the result
        System.out.println(ans);

        scanner.close();
    }
}
```