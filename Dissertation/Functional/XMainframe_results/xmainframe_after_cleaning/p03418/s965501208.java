import java.util.*;
public class Kyopuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inStr = scanner.nextLine();
        String[] parts = inStr.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        long res = 0;
        if (k == 0) {
            System.out.println(n * n);
        } else {
            int i = k + 1;
            int t = n - k;
            for (int j = 0; j < t; j++) {
                long q = n / i;
                long r = n % i;
                res += (i - k) * q + Math.max(r - k + 1, 0);
                i++;
            }
            System.out.println(res);
        }
    }
}
