import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input
        int n = Integer.parseInt(System.console().readLine());

        // Data structures
        char[] inp = System.console().readLine().toCharArray();
        int[] tbl = new int[100000];
        Arrays.fill(tbl, 0);

        // Logic
        int p1 = 0;
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < n && inp[p2] != ' ') {
                p2++;
            }
            String w = new String(inp, p1, p2 - p1);
            tbl[w.length()]++;
            p1 = p2 + 1;
        }

        // Output
        for (int i = 1; i <= n; i++) {
            System.out.println(tbl[i]);
        }
    }
}