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
                int k = 0;
                while (k + i < n) {
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
                count++;
                continue;
            }
            if (count > maxLen) {
                maxLen = count;
                prevStr = strs[j - 1];
            } else if (count == maxLen) {
                System.out.println(prevStr);
                prevStr = strs[j - 1];
            }
            count = 1;
        }

        if (count > maxLen) {
            maxLen = count;
            prevStr = strs[n - 1];
        } else if (count == maxLen) {
            System.out.println(prevStr);
        }

        if (maxLen > 0) {
            for (int k = 0; k < maxLen; k++) {
                System.out.println(prevStr);
            }
        }
    }
}