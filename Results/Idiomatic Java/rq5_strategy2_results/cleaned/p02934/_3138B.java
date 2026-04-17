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

        // Initialize variables
        int[] a = new int[100];
        int p1 = 1;
        int i = 0;

        // Parse input string into array A
        while (i < n && p1 <= inp.length()) {
            int p2 = p1;
            while (p2 <= inp.length() && !Character.isWhitespace(inp.charAt(p2 - 1))) {
                p2++;
            }
            a[i] = Integer.parseInt(inp.substring(p1 - 1, p2 - 1));
            p1 = p2 + 1;
            i++;
        }

        // Calculate WA
        double wa = 0;
        for (int j = 0; j < n; j++) {
            wa += 1.0 / a[j];
        }

        // Calculate OUT
        double out = 1.0 / wa;
        String outStr = String.format("%.10f", out).replace("0.", "");

        // Trim trailing zeros
        int length = outStr.length();
        while (length > 0 && outStr.charAt(length - 1) == '0') {
            length--;
        }
        if (length == 5) {
            length--;
        }
        outStr = outStr.substring(0, length);

        // Display result
        System.out.println(outStr);
    }
}