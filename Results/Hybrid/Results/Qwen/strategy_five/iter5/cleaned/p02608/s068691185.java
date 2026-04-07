import java.util.Arrays;

public class AisingC {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // Assuming input is passed as command line argument
        int[] tbl = new int[10001]; // Array to store counts, initialized to zero by default

        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int v = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (v <= 10000) {
                        tbl[v]++;
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf("%03d\n", tbl[i]);
        }
    }
}