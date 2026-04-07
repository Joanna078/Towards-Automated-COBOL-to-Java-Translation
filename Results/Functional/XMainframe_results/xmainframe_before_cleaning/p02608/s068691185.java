import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] t = new int[10001];
        Arrays.fill(t, 0);
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int v = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (v <= 10000) {
                        t[v]++;
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(t[i]);
        }
    }
}