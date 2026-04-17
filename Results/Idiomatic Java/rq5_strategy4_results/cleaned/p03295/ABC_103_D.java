import java.util.Scanner;
import java.util.Arrays;

public class ABC_103_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input line
        String inp = scanner.nextLine();

        // Split the input into N and M
        String[] parts = inp.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        // Array to hold pairs of numbers
        int[][] ab = new int[M][2];

        // Read M lines of input
        for (int i = 0; i < M; i++) {
            String[] pair = scanner.nextLine().split("\\s+");
            ab[i][0] = Integer.parseInt(pair[0]);
            ab[i][1] = Integer.parseInt(pair[1]);
        }

        // Sort the array based on the second element of each pair
        Arrays.sort(ab, (a, b) -> Integer.compare(a[1], b[1]));

        int done = 0;
        int cnt = 0;

        // Count the number of unique elements based on the condition
        for (int i = 0; i < M; i++) {
            if (done < ab[i][0]) {
                cnt++;
                done = ab[i][1];
            }
        }

        // Output the result
        System.out.println(cnt);
    }
}