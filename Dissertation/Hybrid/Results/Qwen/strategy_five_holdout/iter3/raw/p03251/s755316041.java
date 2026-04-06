```java
import java.util.Arrays;
import java.util.Scanner;

public class ABC110B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int x = Integer.parseInt(parts[2]);
        int y = Integer.parseInt(parts[3]);
        
        input = scanner.nextLine();
        parts = input.split(" ");
        
        int[] array1 = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        
        input = scanner.nextLine();
        parts = input.split(" ");
        
        int[] array2 = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            int t = array1[ptr++];
            if (x < t) {
                x = t;
            }
        }
        
        ptr = 0;
        for (int i = 0; i < m; i++) {
            int t = array2[ptr++];
            if (t < y) {
                y = t;
            }
        }
        
        if (x < y) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
        
        scanner.close();
    }
}
```