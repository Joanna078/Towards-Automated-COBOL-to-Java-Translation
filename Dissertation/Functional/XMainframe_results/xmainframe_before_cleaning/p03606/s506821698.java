import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String[] arr = sc.next().split(" ");
            int l = Integer.parseInt(arr[0]);
            int r = Integer.parseInt(arr[1]);
            sum += (r - l + 1);
        }
        System.out.println(sum);
    }
}