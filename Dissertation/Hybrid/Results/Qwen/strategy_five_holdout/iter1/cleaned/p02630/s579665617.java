import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int q = Integer.parseInt(scanner.nextLine());

        // Initialize arrays and variables
        int[] tbl1 = new int[100001];
        char[] inp = input.toCharArray();
        long cnt1 = 0; // Change to long to handle larger sums
        int p1 = 0;

        // Process input string
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < inp.length && inp[p2] != ' ') {
                p2++;
            }
            int idx = Integer.parseInt(new String(inp, p1, p2 - p1));
            tbl1[idx]++;
            cnt1 += idx;
            p1 = p2 + 1;
        }

        // Process queries
        for (int i = 1; i <= q; i++) {
            String inw = scanner.nextLine();
            String[] parts = inw.split(" ");
            int b = Integer.parseInt(parts[0]);
            int c = Integer.parseInt(parts[1]);

            if (tbl1[b] > 0) {
                cnt1 -= tbl1[b] * b;
                cnt1 += tbl1[b] * c;
                tbl1[c] += tbl1[b];
                tbl1[b] = 0;
            }

            System.out.println(cnt1);
        }

        scanner.close();
    }
}