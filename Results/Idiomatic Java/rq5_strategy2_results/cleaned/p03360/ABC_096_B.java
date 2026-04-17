import java.util.Scanner;

public class ABC_096_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter input string (max 10 characters): ");
        String inp = scanner.nextLine().substring(0, 10);

        System.out.print("Enter integer K: ");
        int k = scanner.nextInt();

        // Initialize variables
        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int len;
        int[] abc = new int[3];
        int tmp = 0;
        int mx = 0;
        String ans = "";

        // Process input string
        for (int n = 0; n < maxlen; n++) {
            j = cur;
            while (j <= inp.length() && !inp.substring(j - 1, j).equals(" ")) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                abc[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur + len - 1));
                cur = j + 1;
                i++;
            }
        }

        // Calculate tmp and mx
        tmp = abc[0] + abc[1] + abc[2];
        mx = Math.max(abc[0], Math.max(abc[1], abc[2]));

        // Adjust tmp and calculate final result
        tmp -= mx;
        mx *= Math.pow(2, k);
        tmp += mx;

        // Convert result to string
        ans = String.format("%05d", tmp);

        // Display result
        System.out.println(ans.trim());

        scanner.close();
    }
}