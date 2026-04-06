```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] skey = new String[n];
        int[] sval = new int[n];
        for (int i = 0; i < n; i++) {
            skey[i] = reader.readLine();
            sval[i] = 1;
        }
        int m = Integer.parseInt(reader.readLine());
        String[] tkey = new String[m];
        int[] tval = new int[m];
        for (int i = 0; i < m; i++) {
            tkey[i] = reader.readLine();
            tval[i] = 1;
        }
        reader.close();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(skey[i], map.getOrDefault(skey[i], 0) + sval[i]);
        }
        for (int i = 0; i < m; i++) {
            map.put(tkey[i], map.getOrDefault(tkey[i], 0) - tval[i]);
        }

        int maxPoint = Arrays.stream(map.values().toArray(Integer[]::new)).max(Integer::compare).orElse(0);
        System.out.println(maxPoint);
    }
}
```