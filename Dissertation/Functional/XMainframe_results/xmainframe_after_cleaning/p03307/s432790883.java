import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = N / 2;
        if (N % 2 == 1) {
            N *= 2;
        }
        String zs = String.format("%d", N);
        String ans = "";
        String[] arr = zs.split(" ");
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
