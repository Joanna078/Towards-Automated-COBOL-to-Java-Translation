import java.util.Scanner;

public class ABC_099_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = scanner.nextInt();
        
        // Initialize variables
        int res = n;
        String ans = "";
        StringBuilder sb = new StringBuilder();

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            int t = i;
            int sumr = 0;

            // Sum of digits of t when divided by 6
            while (t > 0) {
                int r = t % 6;
                sumr += r;
                t /= 6;
            }

            t = n - i;

            // Sum of digits of t when divided by 9
            while (t > 0) {
                int r = t % 9;
                sumr += r;
                t /= 9;
            }

            // Update result with minimum value
            res = Math.min(res, sumr);
        }

        // Convert result to string
        sb.append(res);

        // Reverse the string
        ans = sb.reverse().toString();

        // Output
        System.out.println(ans.substring(0, ans.length()));
    }
}