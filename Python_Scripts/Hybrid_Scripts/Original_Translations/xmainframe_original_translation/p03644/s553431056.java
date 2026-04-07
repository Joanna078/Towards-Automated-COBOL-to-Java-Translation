import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int mxv = 1;
        int mxt = 0;
        for (int i = 2; i <= N; i++) {
            int t = 0;
            int tmp = i;
            while (tmp > 0) {
                t++;
                if (tmp % 2 == 1) break;
                tmp /= 2;
            }
            if (mxt < t) {
                mxv = i;
                mxt = t;
            }
        }
        System.out.println(mxv);
    }
}
