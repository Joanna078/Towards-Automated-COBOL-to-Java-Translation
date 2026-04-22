import java.util.Scanner;

public class ABC_050_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept maxlen
        int maxlen = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String inp = scanner.nextLine();

        // Initialize variables
        int sm = 0;
        int cur = 0;
        int i = 0;
        int[] t = new int[600];

        // Process input string
        for (int n = 0; n < maxlen; n++) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                t[i] = Integer.parseInt(inp.substring(cur, j));
                sm += t[i];
                cur = j + 1;
                i++;
            }
        }

        // Accept M
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Process further inputs
        for (int n = 0; n < m; n++) {
            String inp2 = scanner.nextLine();
            String[] parts = inp2.split(" ");
            int p = Integer.parseInt(parts[0]);
            int x = Integer.parseInt(parts[1]);

            int tmp = sm - t[p - 1] + x;
            String zs = String.format("%08d", tmp);
            String ans = zs.trim();

            System.out.println(ans);
        }

        scanner.close();
    }
}