import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.nextLine();
        int[] nums = Arrays.stream(line.trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
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