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
        for (int i = n - 1; i >= n - k; i--) {
            mx += qary[i];
        }

        System.out.println(mx);
    }
}
```

This Java code preserves the logic of the original COBOL program. It reads two integers `n` and `k`, then reads `n` integers into an array. The array is sorted using Java's built-in sorting method. Finally, it calculates the sum of the last `k` elements in the sorted array and prints the result. This approach maintains the same functionality as the original COBOL program while adhering to modern Java practices.