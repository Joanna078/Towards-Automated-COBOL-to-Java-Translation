import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        long A = Long.parseLong(arr[0]);
        long B = Long.parseLong(arr[1]);
        long ans = 0;
        long cur = 1;
        while (B > cur) {
            ans++;
            cur += A - 1;
        }
        System.out.println(ans);
    }
}