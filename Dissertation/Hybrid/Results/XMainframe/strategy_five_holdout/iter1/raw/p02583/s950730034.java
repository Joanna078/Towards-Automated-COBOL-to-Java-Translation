```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String[] arr = line.split(" ");
        int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        int[] tbl1 = new int[101];
        int[] tbl2 = new int[100];
        int[] k2 = new int[100];
        int p1 = 0;
        int lC = 0;
        long cnt = 0;

        for (int i = 0; i < n; i++) {
            tbl1[i] = nums[i];
        }

        Arrays.sort(tbl1);

        for (int i = 0; i < n; i++) {
            if (i == 0 || tbl1[i] != tbl1[i - 1]) {
                tbl2[lC] = tbl1[i];
                k2[lC] = 1;
                lC++;
            } else {
                k2[lC - 1]++;
            }
        }

        for (int i = 0; i < lC; i++) {
            for (int j = i + 1; j < lC; j++) {
                for (int k = j + 1; k < lC; k++) {
                    if (tbl2[i] + tbl2[j] > tbl2[k] &&
                        tbl2[j] + tbl2[k] > tbl2[i] &&
                        tbl2[k] + tbl2[i] > tbl2[j]) {
                        cnt += (long) k2[i] * k2[j] * k2[k];
                    }
                }
            }
        }

        System.out.println(String.format("%05d", cnt));
    }
}
```