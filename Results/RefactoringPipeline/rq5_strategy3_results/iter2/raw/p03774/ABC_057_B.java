```java
import java.util.Scanner;

public class ABC_057_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and M
        String[] input = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        // Read st1 array
        int[][] st1 = new int[N][2];
        for (int i = 0; i < N; i++) {
            input = scanner.nextLine().split("\\s+");
            st1[i][0] = Integer.parseInt(input[0]);
            st1[i][1] = Integer.parseInt(input[1]);
        }

        // Read pt1 array
        int[][] pt1 = new int[M][2];
        for (int i = 0; i < M; i++) {
            input = scanner.nextLine().split("\\s+");
            pt1[i][0] = Integer.parseInt(input[0]);
            pt1[i][1] = Integer.parseInt(input[1]);
        }

        // Process each point in st1
        for (int i = 0; i < N; i++) {
            int minDistance = 200000001;
            int closestPointIndex = 0; // Start from 0 instead of -1

            // Find the closest point in pt1
            for (int j = 0; j < M; j++) {
                int dx = st1[i][0] - pt1[j][0];
                int dy = st1[i][1] - pt1[j][1];
                int distance = Math.abs(dx) + Math.abs(dy);

                if (distance < minDistance) {
                    minDistance = distance;
                    closestPointIndex = j + 1; // Adjust index to be 1-based
                }
            }

            // Output the closest point index
            System.out.println(closestPointIndex);
        }

        scanner.close();
    }
}
```