import java.util.Scanner;

public class ABC_103_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().trim(); // Trim to remove leading/trailing spaces
        scanner.close();

        int[] A = new int[3];
        int cur = 0;
        int i = 0;

        // Extract numbers from input
        for (int maxlen = 3; maxlen > 0 && i < 3; maxlen--) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                A[i] = Integer.parseInt(inp.substring(cur, j));
                cur = j + 1;
                i++;
            }
        }

        // Sort the array
        for (i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (A[j] < A[i]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        // Calculate the sum of differences
        int sm = Math.abs(A[1] - A[0]) + Math.abs(A[2] - A[1]);

        // Display the result
        System.out.println(sm);
    }
}