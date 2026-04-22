import java.util.*;

public class ABC_106_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        long K = sc.nextLong();
        sc.close();

        for (int i = 0; i < K; i++) {
            if (i >= S.length()) {
                break;
            }
            if (S.charAt(i) != '1') {
                System.out.println(S.charAt(i));
                return;
            }
        }
        System.out.println('1');
    }
}