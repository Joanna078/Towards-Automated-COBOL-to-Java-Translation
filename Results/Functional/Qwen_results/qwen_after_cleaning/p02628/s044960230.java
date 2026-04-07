import java.util.Arrays;
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        String[] parts = ln.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);

        String inData = scanner.nextLine();
        scanner.close();

        int[] p = new int[n];
        int cur = 0;
        int i = 0;

        while (cur < inData.length()) {
            int j = cur;
            while (j < inData.length() && inData.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            p[i++] = Integer.parseInt(inData.substring(cur, j));
            cur = j + 1;
        }

        Arrays.sort(p);

        int ans = 0;
        for (int m = 0; m < k; m++) {
            ans += p[m];
        }

        System.out.println(ans);
    }
}