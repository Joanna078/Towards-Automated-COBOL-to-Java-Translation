```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.next();
        int[] DX = new int[2];
        for (int i = 0; i < 2; i++) {
            int start = i * 3;
            int end = Math.min((i + 1) * 3, line.length());
            if (end > start) {
                DX[i] = Integer.parseInt(line.substring(start, end));
            } else {
                DX[i] = 0; // Handle case where substring is empty
            }
        }
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int sm = 0;
        for (int p = 0; p <= DX[0]; p++) {
            for (int q = 0; q < N; q++) {
                if (p == 0 || p % A[q] == 0) {
                    sm++;
                }
            }
        }
        sm += DX[1];
        System.out.println(sm);
    }
}
```