import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int a1 = p + q;
        int a2 = q + r;
        int a3 = p + r;
        int ans = Math.min(Math.min(a1, a2), a3);
        System.out.println(ans);
    }
}