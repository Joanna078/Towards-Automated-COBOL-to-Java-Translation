import java.util.HashMap;
import java.util.Map;

public class ABC_091_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> sMap = new HashMap<>();
        
        for (int i = 1; i <= n; i++) {
            String key = scanner.nextLine();
            sMap.put(key, sMap.getOrDefault(key, 0) + 1);
        }
        
        int m = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> tMap = new HashMap<>();
        
        for (int i = 1; i <= m; i++) {
            String key = scanner.nextLine();
            tMap.put(key, tMap.getOrDefault(key, 0) + 1);
        }
        
        int point = 0;
        
        for (Map.Entry<String, Integer> entry : sMap.entrySet()) {
            int value = entry.getValue() - tMap.getOrDefault(entry.getKey(), 0);
            point = Math.max(point, value);
        }
        
        System.out.println(point);
    }
}
```

This Java code translates the given COBOL program into a modern Java 17 application. It uses `HashMap` to store the counts of keys from two different sets (`sMap` and `tMap`). The logic for updating these maps and calculating the `point` is preserved as closely as possible to the original COBOL program. The final result is printed out using `System.out.println`.