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
        for (int i = 0; i < n; i++) {
            map.put(s[i], map.getOrDefault(s[i], 0) + c[i]);
        }
        for (int i = 0; i < m; i++) {
            map.put(t[i], map.getOrDefault(t[i], 0) - p[i]);
        }

        int maxPoint = Arrays.stream(map.values().toArray(Integer[]::new)).max(Integer::compare).orElse(0);
        System.out.println(maxPoint);
    }
}