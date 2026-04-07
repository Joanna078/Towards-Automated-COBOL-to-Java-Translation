import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.next();
        int[] nums = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            if (!set.contains(i)) {
                set.add(nums[i - 1]);
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}