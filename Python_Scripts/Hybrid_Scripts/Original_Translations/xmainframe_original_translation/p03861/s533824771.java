import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);
        long x = Long.parseLong(arr[2]);
        long q1 = x / a;
        long q2 = x / b;
        long r = x % a;
        if (r == 0) {
            q2--;
        }
        long ans = q2 - q1;
        System.out.println(String.format("%d", ans));
    }
}
