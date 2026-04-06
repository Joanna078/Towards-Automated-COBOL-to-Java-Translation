import java.util.Arrays;

public class ABC_061_B {
    public static void main(String[] args) {
        // Working storage variables
        String inp = "input"; // Replace with actual input
        int n;
        int m;
        String inp2;
        long i;
        int len;
        int a;
        int b;
        int[] town = new int[50];
        String ans = "";
        int zs;
        char dummy;

        // Input processing
        String[] parts = inp.split(" ");
        n = Integer.parseInt(parts[0]);
        m = Integer.parseInt(parts[1]);

        // Loop to process input2
        for (i = 1; i <= m; i++) {
            inp2 = "input2_" + i; // Replace with actual input
            parts = inp2.split(" ");
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);

            town[a]++;
            town[b]++;
        }

        // Loop to prepare answer
        for (i = 1; i <= n; i++) {
            zs = town[(int) i];
            dummy = ' ';
            ans += String.format("%d", zs);
        }

        // Output processing
        System.out.println(ans.trim());
    }
}