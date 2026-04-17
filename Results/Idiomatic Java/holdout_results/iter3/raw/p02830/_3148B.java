```java
import java.util.Scanner;

public class Program148B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        System.out.print("Enter INP: ");
        String inp = scanner.nextLine();

        // Unstring INP into S and T
        String[] parts = inp.split(" ", 2);
        String s = parts[0];
        String t = parts.length > 1 ? parts[1] : "";

        // Initialize ST
        StringBuilder st = new StringBuilder();

        // Perform loop
        for (int i = 0; i < n; i++) {
            if (i < s.length()) {
                st.append(s.charAt(i));
            }
            if (i < t.length()) {
                st.append(t.charAt(i));
            }
        }

        // Display ST
        System.out.println(st.toString());

        scanner.close();
    }
}
```