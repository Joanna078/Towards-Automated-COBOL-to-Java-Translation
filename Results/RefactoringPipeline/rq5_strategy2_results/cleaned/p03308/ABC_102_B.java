import java.util.Scanner;

public class ABC_102_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine();

        int maxlen = N;
        int cur = 0;
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j < INP.length() && INP.charAt(j) != ' ') {
                j++;
            }

            if (j > cur) {
                int len = j - cur;
                String A = INP.substring(cur, j);

                int numA = Integer.parseInt(A);
                mn = Math.min(mn, numA);
                mx = Math.max(mx, numA);

                cur = j + 1;
            }
        }

        int df = mx - mn;
        String ZS = String.format("%10d", df);

        // Extract the last 10 characters from ZS
        String ans = ZS.substring(ZS.length() - 10);

        System.out.println(ans.trim());
    }
}