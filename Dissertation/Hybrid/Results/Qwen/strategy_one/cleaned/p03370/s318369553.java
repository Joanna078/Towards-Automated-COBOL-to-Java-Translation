import java.util.Arrays;

public class ABC_095_B {
    public static void main(String[] args) {
        String inp = "example input"; // Replace with actual input
        int[] nx = new int[3];
        Arrays.fill(nx, 0);
        int sm = 0;
        int mn = Integer.MAX_VALUE;
        int x = 0;
        StringBuilder ans = new StringBuilder();

        // Process input to populate nx array
        int cur = 0;
        while (cur < inp.length()) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            nx[cur / 8] += Integer.parseInt(inp.substring(cur, j));
            cur = j + 1;
        }

        // Calculate sm and mn
        for (int k = 1; k <= nx[0]; k++) {
            int inp2 = Integer.parseInt("input2"); // Replace with actual input
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
    }
}