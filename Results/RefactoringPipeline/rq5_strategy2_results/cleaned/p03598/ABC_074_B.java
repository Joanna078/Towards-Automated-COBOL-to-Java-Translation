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
        int cur = 1;
        int sm = 0;

        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j <= INP.length() && !INP.substring(j - 1, j).equals(" ")) {
                j++;
            }
            int len = j - cur;
            int x = Integer.parseInt(INP.substring(cur - 1, cur - 1 + len));

            x = Math.min(x, K - x);
            x *= 2;
            sm += x;

            cur = j + 1;
        }

        String ZS = String.format("%06d", sm);
        String ans = ZS.replaceFirst("^\\s+", "");

        System.out.println(ans);
    }
}