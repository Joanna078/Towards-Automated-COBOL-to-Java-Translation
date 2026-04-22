import java.util.Arrays;
import java.util.Scanner;

public class ABC_100_D {

    private static final int MAX_SIZE = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        long[][] arrays = new long[8][MAX_SIZE];
        long[] sums = new long[8];

        // Read and process each line
        for (int i = 0; i < N; i++) {
            inp = scanner.nextLine();
            parts = inp.split("\\s+");
            long x = Long.parseLong(parts[0]);
            long y = Long.parseLong(parts[1]);
            long z = Long.parseLong(parts[2]);

            arrays[0][i] = -x - y - z;
            arrays[1][i] = -x - y + z;
            arrays[2][i] = -x + y - z;
            arrays[3][i] = x - y - z;
            arrays[4][i] = -x + y + z;
            arrays[5][i] = x - y + z;
            arrays[6][i] = x + y - z;
            arrays[7][i] = x + y + z;
        }

        // Sort each array in descending order
        for (int j = 0; j < 8; j++) {
            Arrays.sort(arrays[j]);
            reverseArray(arrays[j]);
        }

        // Sum the first M elements of each sorted array
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 8; j++) {
                sums[j] += arrays[j][i];
            }
        }

        // Find the maximum sum
        long maxSum = Arrays.stream(sums).max().orElse(0);

        // Output the result
        System.out.println(maxSum);
    }

    private static void reverseArray(long[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            long temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}