import java.util.Scanner;

public class ABC_074_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input values
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String INP = scanner.nextLine();

        int maxlen = N;
        int cur = 0;
        int sm = 0;

        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j < INP.length() && INP.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            String xStr = INP.substring(cur, cur + len);
            int x = Integer.parseInt(xStr);

            x = Math.min(x, K - x);
            x *= 2;
            sm += x;

            cur = j + 1;
        }

        String ZS = String.format("%06d", sm);
        String ans = ZS.replaceAll("\\s+", "");

        System.out.println(ans);
    }
}