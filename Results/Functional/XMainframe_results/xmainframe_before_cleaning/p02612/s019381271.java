import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int qt, rm, num, ans;
        String zs;
        qt = N / 1000;
        rm = N % 1000;
        num = 1000 - rm;
        qt = num / 1000;
        ans = num % 1000;
        zs = String.format("%d", ans);
        System.out.println(zs.trim());
    }
}