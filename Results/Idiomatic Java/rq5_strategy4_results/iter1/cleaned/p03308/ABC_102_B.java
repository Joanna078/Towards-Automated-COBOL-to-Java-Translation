import java.util.Scanner;

public class ABC_102_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Read INP
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
                String A = INP.substring(cur, cur + len);
                int num = Integer.parseInt(A);
                mn = Math.min(mn, num);
                mx = Math.max(mx, num);
                cur = j + 1;
            }
        }

        int df = mx - mn;
        String ZS = String.format("%10d", df);
        String ans = ZS.trim();

        System.out.println(ans);
    }
}