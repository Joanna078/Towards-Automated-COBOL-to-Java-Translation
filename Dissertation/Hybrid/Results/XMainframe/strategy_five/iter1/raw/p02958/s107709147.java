```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.nextLine().trim();
        String[] parts = line.split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
```