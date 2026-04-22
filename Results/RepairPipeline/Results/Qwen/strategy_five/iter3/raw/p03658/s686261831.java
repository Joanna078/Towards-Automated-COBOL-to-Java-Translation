```java
import java.util.Arrays;

public class ABC_067_B {
    public static void main(String[] args) {
        String nk = "10 5"; // Example input
        String inp = "5 3 8 4 2 7 1 6"; // Example input

        int n = Integer.parseInt(nk.split(" ")[0]);
        int k = Integer.parseInt(nk.split(" ")[1]);

        String[] parts = inp.split(" ");
        int[] qary = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            qary[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(qary);

        int mx = 0;
        for (int i = qary.length - 1; i >= qary.length - k; i--) {
            mx += qary[i];
        }

        System.out.println(mx);
    }
}
```