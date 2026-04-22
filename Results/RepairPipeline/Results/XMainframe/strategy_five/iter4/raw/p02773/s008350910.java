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
                int left = n - i;
                int k = 1;
                while (k <= left) {
                    int j = k;
                    while (j > 0) {
                        if (j + i <= strs.length && strs[j - 1].compareTo(strs[j + i - 1]) > 0) {
                            String temp = strs[j - 1];
                            strs[j - 1] = strs[j + i - 1];
                            strs[j + i - 1] = temp;
                        } else {
                            break;
                        }
                        j -= i;
                    }
                    k++;
                }
                i /= 2;
            }
        }

        int maxLen = 0;
        int count = 1;
        if (n > 0) {
            String prevStr = strs[0];
            for (int j = 1; j < n; j++) {
                if (!strs[j].equals(prevStr)) {
                    if (j - count > maxLen) {
                        maxLen = j - count;
                        prevStr = strs[count - 1];
                    } else if (j - count == maxLen) {
                        count = j;
                        prevStr = strs[count - 1];
                    }
                }
            }

            if (maxLen > 0) {
                for (int k = 1; k <= maxLen; k++) {
                    System.out.println(strs[count - k]);
                }
            }
        }
    }
}
```