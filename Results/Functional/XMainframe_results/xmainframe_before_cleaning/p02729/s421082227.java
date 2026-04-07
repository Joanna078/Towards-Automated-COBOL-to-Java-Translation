import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        String[] arr = ln.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int ans = n * (n - 1) / 2 + m * (m - 1) / 2;
        System.out.println(ans);
    }
}