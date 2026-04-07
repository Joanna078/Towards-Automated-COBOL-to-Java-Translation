```java
import java.util.Arrays;
import java.util.Scanner;

public class ABC_103_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        // Array initialization
        int[][] ab = new int[m][2];
        for (int i = 0; i < m; i++) {
            inp = scanner.nextLine();
            parts = inp.split(" ");
            ab[i][0] = Integer.parseInt(parts[0]);
            ab[i][1] = Integer.parseInt(parts[1]);
        }

        // Sorting based on the second column of the array
        Arrays.sort(ab, (a, b) -> Integer.compare(a[1], b[1]));

        // Logic to find the count
        int done = 0;
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if (done < ab[i][0]) {
                cnt++;
                done = ab[i][1];
                done--;
            }
        }

        // Output formatting
        String ans = String.format("%06d", cnt);

        // Remove leading zeros
        ans = ans.replaceAll("^0+", "");

        System.out.println(ans);
    }
}
```