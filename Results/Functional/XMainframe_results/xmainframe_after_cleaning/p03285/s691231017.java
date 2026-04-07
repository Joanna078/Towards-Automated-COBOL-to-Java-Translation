import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flg = false;
        for (int i = 0; i <= N / 4; i++) {
            for (int j = 0; j <= N / 7; j++) {
                if (4 * i + 7 * j == N) {
                    flg = true;
                }
            }
        }
        System.out.println(flg ? "Yes" : "No");
    }
}
