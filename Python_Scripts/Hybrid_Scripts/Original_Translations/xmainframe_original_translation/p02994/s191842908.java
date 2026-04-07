import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        if (arr[0].startsWith("-")) {
            N = -N;
        }
        int L = Integer.parseInt(arr[1]);
        if (arr[1].startsWith("-")) {
            L = -L;
        }
        long ans = (long) N * (2 * L + N - 1) / 2;
        if (L > 0) {
            ans -= L;
        } else if (L + N - 1 < 0) {
            ans -= (L + N - 1);
        }
        if (ans == 0) {
            System.out.println(0);
        } else {
            System.out.println(-ans);
        }
    }
}
