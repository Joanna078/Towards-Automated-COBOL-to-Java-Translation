```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[100001]; // Adjusted size to match COBOL array size
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[100001]; // Adjusted size to match COBOL array size
        Arrays.fill(visited, false);
        int count = 0;
        int current = 1;
        while (current != 0 && !visited[current]) { // Ensure current is within bounds
            visited[current] = true;
            count++;
            if (current == 2) {
                break;
            }
            current = A[current];
        }
        if (count == 0 || current == 0) { // Handle case where loop exits without finding 2
            count = -1;
        }
        System.out.println(count);
    }
}
```