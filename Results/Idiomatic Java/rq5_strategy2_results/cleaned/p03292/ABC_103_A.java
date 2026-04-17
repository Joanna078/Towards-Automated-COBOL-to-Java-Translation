import java.util.Scanner;

public class ABC_103_A {

    private static final int MAXLEN = 3;
    private static final int INPUT_LENGTH = 12;
    private static final int ARRAY_SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine().substring(0, INPUT_LENGTH);
        scanner.close();

        int[] A = new int[ARRAY_SIZE];
        int cur = 0;
        int i = 0;

        // Extract numbers from input
        for (int n = 0; n < MAXLEN && i < ARRAY_SIZE; n++) {
            int j = cur;
            while (j < INPUT_LENGTH && inp.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                A[i] = Integer.parseInt(inp.substring(cur, cur + len));
                cur = j + 1;
                i++;
            }
        }

        // Sort the array
        for (i = 0; i < ARRAY_SIZE - 1; i++) {
            for (int j = i + 1; j < ARRAY_SIZE; j++) {
                if (A[j] < A[i]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        // Calculate the sum of differences
        int sm = A[1] - A[0] + A[2] - A[1];

        // Convert the sum to a string
        String ans = String.format("%03d", sm);

        // Display the result
        System.out.println(ans.trim());
    }
}