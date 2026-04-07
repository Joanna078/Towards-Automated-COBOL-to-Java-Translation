import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        if (A[N - 1] * 4 < A[N - 2] * 3) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
