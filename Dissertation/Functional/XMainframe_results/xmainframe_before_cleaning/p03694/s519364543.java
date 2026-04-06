import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int mn = Arrays.stream(arr).min().getAsInt();
        int mx = Arrays.stream(arr).max().getAsInt();
        System.out.println(mx - mn);
    }
}