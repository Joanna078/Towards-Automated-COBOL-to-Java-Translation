import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ABC_091_B {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        Map<String, Integer> sMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String tmpkey = scanner.next();
            sMap.put(tmpkey, sMap.getOrDefault(tmpkey, 0) + 1);
        }

        int M = scanner.nextInt();
        Map<String, Integer> tMap = new HashMap<>();
        for (int i = 0; i < M; i++) {
            String tmpkey = scanner.next();
            tMap.put(tmpkey, tMap.getOrDefault(tmpkey, 0) + 1);
        }

        int point = 0;
        for (Map.Entry<String, Integer> entry : sMap.entrySet()) {
            int tmp = entry.getValue();
            if (tMap.containsKey(entry.getKey())) {
                tmp -= tMap.get(entry.getKey());
            }
            point = Math.max(point, tmp);
        }

        System.out.printf("%d%n", point);
    }
}