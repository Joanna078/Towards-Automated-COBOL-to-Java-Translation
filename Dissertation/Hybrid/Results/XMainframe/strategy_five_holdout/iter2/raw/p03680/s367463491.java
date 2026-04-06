```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N]; // Adjusted size to match input size
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[100001]; // Adjusted size to match COBOL array size
        Arrays.fill(visited, false);
        int count = 0;
        int current = 1;
        while (!visited[current]) {
            visited[current] = true;
            count++;
            if (current == 2) {
                break;
            }
            current = A[current - 1];
        }
        if (count == 0) {
            count = -1;
        }
        System.out.println(count);
    }
}
```