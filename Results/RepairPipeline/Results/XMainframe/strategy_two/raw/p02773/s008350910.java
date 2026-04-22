```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] inputs = line.split(" ");
        int n = Integer.parseInt(inputs[0]);
        String[] strs = Arrays.copyOfRange(inputs, 1, inputs.length);

        if (n > 1) {
            int mid = n / 2;
            int i = mid;
            while (i > 0) {
                int left = mid - i;
                int k = left;
                while (k < n - i) { // Changed condition to avoid ArrayIndexOutOfBoundsException
                    if (strs[k].compareTo(strs[k + i]) > 0) {
                        String temp = strs[k];
                        strs[k] = strs[k + i];
                        strs[k + i] = temp;
                    }
                    k++;
                }
                i /= 2;
            }
        }

        int maxLen = 0;
        int count = 1;
        String prevStr = strs[0];
        for (int j = 1; j < n; j++) {
            if (strs[j].equals(prevStr)) {
                continue;
            }
            if (j - count > maxLen) {
                maxLen = j - count;
                prevStr = strs[count];
            } else if (j - count == maxLen) {
                System.out.println(strs[count]);
                count = j;
                prevStr = strs[count];
            }
        }

        if (maxLen > 0) {
            for (int k = 1; k <= maxLen; k++) {
                System.out.println(strs[count - k]);
            }
        }
    }
}
```