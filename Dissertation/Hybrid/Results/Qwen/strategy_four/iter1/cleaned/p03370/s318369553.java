import java.util.Arrays;
import java.util.Scanner;

public class ABC_095_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine(); // Accept input
        int[] nx = new int[3];
        Arrays.fill(nx, 0);
        int sm = 0;
        int mn = 1001;
        int x = 0;
        StringBuilder ans = new StringBuilder();

        // Process input to populate nx array
        int cur = 0;
        int i = 1;
        while (cur < inp.length()) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            nx[i] = Integer.parseInt(inp.substring(cur, j));
            cur = j + 1;
            i++;
        }

        // Calculate sm and mn
        for (int k = 1; k <= nx[0]; k++) {
            int inp2 = scanner.nextInt(); // Accept input
            sm += inp2;
            mn = Math.min(mn, inp2);
        }

        // Perform division and addition
        int tmp = nx[2] - sm;
        x = tmp / mn;
        nx[1] += x;

        // Convert result to string
        ans.append(nx[1]);

        // Display output
        System.out.println(ans.toString());
        scanner.close();
    }
}