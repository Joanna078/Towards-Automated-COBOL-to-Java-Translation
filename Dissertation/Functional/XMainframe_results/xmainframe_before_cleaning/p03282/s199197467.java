import java.util.*;

public class ABC_106_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        sc.close();

        int len = S.length();
        if (K <= len) {
            System.out.println(S.charAt((int) K - 1));
        } else {
            System.out.println('1');
        }
    }
}