import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmpN = N / 15;
        int tmp = 800 * N - 200 * tmpN;
        String ZS = String.format("%d", tmp);
        String ans = "";
        String[] parts = ZS.split(" ");
        ans = parts[0];
        System.out.println(ans);
    }
}
