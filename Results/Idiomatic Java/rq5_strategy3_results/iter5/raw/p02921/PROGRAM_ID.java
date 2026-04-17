```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input strings S and T
        System.out.print("Enter string S: ");
        String S = scanner.nextLine();
        System.out.print("Enter string T: ");
        String T = scanner.nextLine();

        // Ensure both strings are of length 3
        if (S.length() != 3 || T.length() != 3) {
            System.out.println("Both strings must be of length 3.");
            return;
        }

        int len = 3;
        int ans = 0;

        // Compare characters at each position
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == T.charAt(i)) {
                ans++;
            }
        }

        // Display the result
        System.out.println(ans);
    }
}
```