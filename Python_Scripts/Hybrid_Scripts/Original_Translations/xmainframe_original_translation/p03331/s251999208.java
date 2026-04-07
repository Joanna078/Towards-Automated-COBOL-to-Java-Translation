import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int half = N / 2;
        int sm = 99;
        for (int i = 1; i <= half; i++) {
            int a = i;
            int b = N - i;
            int asm = 0;
            while (a > 0) {
                asm += a % 10;
                a /= 10;
            }
            int bsm = 0;
            while (b > 0) {
                bsm += b % 10;
                b /= 10;
            }
            if (bsm + asm < sm) {
                sm = bsm + asm;
            }
        }
        System.out.println(sm);
    }
}
