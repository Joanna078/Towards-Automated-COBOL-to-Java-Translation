import java.util.Arrays;

public class ABC_067_B {
    public static void main(String[] args) {
        String nk = "10 5"; // Example input
        String inp = "5 3 8 4 2 7 1 6"; // Example input

        int n = Integer.parseInt(nk.split(" ")[0]);
        int k = Integer.parseInt(nk.split(" ")[1]);

        String[] parts = inp.split(" ");
        int[] qary = new int[n];
        for (int i = 0; i < n; i++) {
            qary[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(qary);

        int mx = 0;
        for (int i = n - 1; i >= n - k && i >= 0; i--) { // Added check for i >= 0
            mx += qary[i];
        }

        System.out.println(mx);
    }
}