import java.util.Scanner;

public class ABC_076_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        System.out.print("Enter K: ");
        int K = scanner.nextInt();

        int board = 1;

        for (int i = 1; i <= N; i++) {
            board = Math.min(board * 2, board + K);
        }

        String ZS = String.format("%012d", board);
        String ans = ZS.trim();

        System.out.println(ans);
    }
}