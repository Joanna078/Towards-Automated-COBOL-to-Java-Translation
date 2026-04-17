import java.util.Scanner;

public class ABC_064_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and INP
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String INP = scanner.nextLine();

        int maxlen = N;
        int cur = 0;
        int mn = 1001;
        int mx = 0;

        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j < INP.length() && INP.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                int a = Integer.parseInt(INP.substring(cur, j));
                mn = Math.min(mn, a);
                mx = Math.max(mx, a);
            }
            cur = j + 1;
        }

        int result = mx - mn;
        String ans = String.valueOf(result);

        // Remove leading spaces
        ans = ans.stripLeading();

        System.out.println(ans);
    }
}