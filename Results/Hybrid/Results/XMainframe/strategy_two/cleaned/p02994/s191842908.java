import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int L = Integer.parseInt(arr[1]);
        long ans = (long) N * (2 * L + N - 1) / 2;
        if (L > 0) {
            ans -= L;
        } else if (L + N - 1 < 0) {
            ans -= (L + N - 1);
        }
        System.out.println(ans);
    }
}