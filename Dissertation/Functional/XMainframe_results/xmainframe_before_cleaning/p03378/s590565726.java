import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        String line2 = reader.readLine();
        int maxlen = Integer.parseInt(line1.split(" ")[0]);
        int[] inp2 = Arrays.stream(line2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a = new int[maxlen + 1];
        Arrays.fill(a, 1);
        for (int i : inp2) {
            a[i] = 0;
        }
        int sm = 101;
        for (int i = 0; i < maxlen; i++) {
            if (a[i] == 1) {
                int tmp = 0;
                for (int j = i; j < maxlen; j++) {
                    if (a[j] == 1) {
                        tmp += 1;
                    }
                }
                sm = Math.min(sm, tmp);
            }
        }
        System.out.println(sm);
    }
}