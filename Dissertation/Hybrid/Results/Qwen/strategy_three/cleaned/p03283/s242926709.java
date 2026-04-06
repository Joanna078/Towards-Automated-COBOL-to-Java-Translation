import java.util.Arrays;

public class ABC_106_D {
    public static void main(String[] args) {
        String inp1 = "10 5 3"; // Example input
        String[] inputs = inp1.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int q = Integer.parseInt(inputs[2]);

        int[][] train = new int[n][n];
        int[][] trainSumRow = new int[n][n];
        int[][] trainSumCol = new int[n][n];

        for (int k = 0; k < m; k++) {
            String inp2 = "1 2"; // Example input
            inputs = inp2.split(" ");
            int x = Integer.parseInt(inputs[0]) - 1;
            int y = Integer.parseInt(inputs[1]) - 1;

            train[y][x]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                trainSumRow[i][j] = trainSumRow[i][j - 1] + train[i][j - 1];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trainSumCol[i][j] = trainSumCol[i - 1][j] + train[i - 1][j];
            }
        }

        for (int k = 0; k < q; k++) {
            String inp2 = "1 2"; // Example input
            inputs = inp2.split(" ");
            int x = Integer.parseInt(inputs[0]) - 1;
            int y = Integer.parseInt(inputs[1]) - 1;

            int t;
            if (x == 0) {
                t = trainSumRow[y][n - 1];
            } else {
                t = trainSumRow[y][n - 1] - trainSumRow[y][x - 1]
                        - trainSumCol[x][y - 1] + trainSumCol[x][y];
            }

            System.out.println(t);
        }
    }
}