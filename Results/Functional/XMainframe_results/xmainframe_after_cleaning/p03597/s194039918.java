import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        n = (int) Math.pow(n, 2);
        n -= a;

        System.out.println(String.format("%d", n));
    }
}
