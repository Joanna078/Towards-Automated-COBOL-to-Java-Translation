import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int x = Integer.parseInt(arr[3]);
        int y = Integer.parseInt(arr[4]);
        int max = a * x + b * y;
        int big = Math.max(a, b);
        int sa = Math.abs(x - y);
        if (a + b <= 2 * c) {
            max = max;
        } else {
            max -= (a + b - 2 * c) * Math.min(x, y);
        }
        if (big > 2 * c) {
            max -= (big - 2 * c) * sa;
        }
        System.out.println(String.format("%d", max));
    }
}
