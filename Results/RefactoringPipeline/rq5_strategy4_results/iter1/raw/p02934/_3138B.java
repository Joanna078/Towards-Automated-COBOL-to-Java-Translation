```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        System.out.print("Enter INP: ");
        String inp = scanner.nextLine();

        int[] a = new int[100];
        int p1 = 0;
        int i = 0;

        // Split input string into numbers
        while (i < n && p1 < inp.length()) {
            int p2 = p1;
            while (p2 < inp.length() && !Character.isWhitespace(inp.charAt(p2))) {
                p2++;
            }
            a[i] = Integer.parseInt(inp.substring(p1, p2));
            p1 = p2 + 1;
            i++;
        }

        double wa = 0.0;
        for (int j = 0; j < n; j++) {
            wa += 1.0 / a[j];
        }

        double out = 1.0 / wa;
        String outStr = String.format("%.10f", out).replaceFirst("^0+(?!$)", "");

        // Trim trailing zeros after decimal point
        int len = outStr.length();
        while (len > 0 && outStr.charAt(len - 1) == '0') {
            len--;
        }
        if (outStr.charAt(len - 1) == '.') {
            len--;
        }
        outStr = outStr.substring(0, len);

        System.out.println(outStr);
    }
}
```