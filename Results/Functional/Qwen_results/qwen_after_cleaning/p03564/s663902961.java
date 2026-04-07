import java.util.Scanner;

public class ABC_076_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Initialize variables
        long board = 1;
        StringBuilder ans = new StringBuilder();
        String ZS = "";

        // Perform loop
        for (int i = 1; i <= N; i++) {
            board = Math.min(board * 2, board + K);
        }

        // Convert board to string
        ZS = Long.toString(board);

        // Unstring operation
        for (char c : ZS.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }

        // Output result
        System.out.println(ans.toString());

        scanner.close();
    }
}