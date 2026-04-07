import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input values
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();

        // Working storage variables
        int wa = 0;
        int p1 = 1;
        int[] tw = new int[100];
        int i, s1, s2, p2;

        // Process each word in the input string
        for (i = 1; i <= n; i++) {
            p2 = p1;
            while (p2 <= n && inp.charAt(p2 - 1) != ' ') {
                p2++;
            }
            int w = Integer.parseInt(inp.substring(p1 - 1, p2 - 1));
            wa += w;
            tw[i - 1] = wa;
            p1 = p2 + 1;
        }

        // Calculate half of the total sum
        double hf = (double) wa / 2;

        // Find the first index where the cumulative sum is greater than or equal to half
        for (i = 0; i < n && tw[i] < hf; i++);

        // Determine the output based on conditions
        if (tw[i] == hf) {
            System.out.println("0");
        } else {
            s1 = wa - tw[i] * 2;
            s2 = i > 0 ? wa - tw[i - 1] * 2 : wa - tw[i] * 2;
            System.out.println(s1 < s2 ? s1 : s2);
        }
    }
}