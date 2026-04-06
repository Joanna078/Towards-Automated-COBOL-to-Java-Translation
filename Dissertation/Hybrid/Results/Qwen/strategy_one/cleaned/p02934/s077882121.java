import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input values
        int n = Integer.parseInt(System.console().readLine());
        String inp = System.console().readLine();

        // Working storage
        int[] a = new int[n];
        int p1 = 0;
        double wa = 0;
        StringBuilder out = new StringBuilder("         ");

        // Process input string
        for (int i = 0; i < n; i++) {
            int p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            a[i] = Integer.parseInt(inp.substring(p1, p2));
            p1 = p2 + 1;
        }

        // Calculate average
        for (int value : a) {
            wa += 1.0 / value;
        }

        // Compute result
        double result = 1.0 / wa;
        int i;
        for (i = 9; i >= 0; i--) {
            if (result == 0 || result % 10 != 0) {
                break;
            }
            result /= 10;
            out.setCharAt(i, ' ');
        }
        if (i == 4) {
            out.setCharAt(i, ' ');
        }

        // Output result
        System.out.println(out.toString().trim());
    }
}