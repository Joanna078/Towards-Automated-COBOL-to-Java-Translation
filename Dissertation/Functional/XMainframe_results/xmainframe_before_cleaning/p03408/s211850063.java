import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] s = new String[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            s[i] = line[0];
            c[i] = Integer.parseInt(line[1]);
        }
        int m = Integer.parseInt(reader.readLine());
        String[] t = new String[m];
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            String[] line = reader.readLine().split(" ");
            t[i] = line[0];
            p[i] = Integer.parseInt(line[1]);
        }
        reader.close();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                map.put(s[i], map.getOrDefault(s[i], 0) + c[i]);
            } else {
                map.put(t[i - n], map.getOrDefault(t[i - n], 0) - p[i - n]);
            }
        }

        int maxPoint = Arrays.stream(map.values().toArray()).max().get();
        System.out.println(maxPoint);
    }
}