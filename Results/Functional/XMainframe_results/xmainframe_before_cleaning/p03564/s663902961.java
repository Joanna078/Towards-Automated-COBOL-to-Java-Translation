import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long board = 1;
        for (int i = 0; i < N; i++) {
            board = Math.min(board * 2, board + K);
        }
        System.out.println(board);
    }
}