```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        String line = sc.nextLine().trim();
        String[] parts = line.split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        Set<Integer> set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                cnt++;
            }
        }
        if (cnt <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```