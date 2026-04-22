import java.util.Scanner;

public class ABC_096_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept INP
        String inp = scanner.nextLine().trim();

        // Accept K
        int k = scanner.nextInt();

        // Initialize variables
        int maxlen = 3;
        int cur = 0;
        int[] abc = new int[3];
        int i = 0;

        // Process input string
        for (int j = 0; j < maxlen && cur < inp.length(); j++) {
            int start = cur;
            while (cur < inp.length() && !Character.isWhitespace(inp.charAt(cur))) {
                cur++;
            }
            int len = cur - start;
            if (len > 0) {
                abc[i] = Integer.parseInt(inp.substring(start, cur));
                i++;
            }
            cur++;
        }

        // Calculate sum and max
        int sum = abc[0] + abc[1] + abc[2];
        int max = Math.max(abc[0], Math.max(abc[1], abc[2]));

        // Compute result
        sum -= max;
        max *= Math.pow(2, k);
        sum += max;

        // Convert result to string
        String zs = String.format("%06d", sum);

        // Extract answer
        String ans = zs.substring(1);

        // Display answer
        System.out.println(ans.trim());

        scanner.close();
    }
}