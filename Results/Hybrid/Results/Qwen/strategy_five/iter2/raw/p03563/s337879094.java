```java
import java.util.Scanner;

public class ABC_076_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Working storage variables
        int r;
        int g;
        StringBuilder zs = new StringBuilder();
        String ans = "";

        // Input section
        System.out.print("Enter R: ");
        r = scanner.nextInt();
        System.out.print("Enter G: ");
        g = scanner.nextInt();

        // Logic section
        r -= g;
        r += g;
        zs.append(r);
        unans(zs, ans);

        // Output section
        System.out.println(ans.substring(0, ans.length()));
    }

    private static void unans(StringBuilder zs, String ans) {
        // Unstring logic
        String dummy = "";
        ans = zs.toString().trim(); // Remove leading/trailing spaces
    }
}
```