import java.util.Scanner;
import java.util.Arrays;

public class ABC_103_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input line
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        // Read pairs of numbers
        int[][] ab = new int[M][2];
        for (int i = 0; i < M; i++) {
            inp = scanner.nextLine();
            parts = inp.split("\\s+");
            ab[i][0] = Integer.parseInt(parts[0]);
            ab[i][1] = Integer.parseInt(parts[1]);
        }

        // Sort based on the second element of each pair
        Arrays.sort(ab, (a, b) -> Integer.compare(a[1], b[1]));

        int done = 0;
        int cnt = 0;

        // Count unique sequences
        for (int i = 0; i < M; i++) {
            if (done < ab[i][0]) {
                cnt++;
                done = ab[i][1] - 1;
            }
        }

        // Output the result
        System.out.printf("%06d%n", cnt);
    }
}