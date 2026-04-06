import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);
        int mx = Math.max(a, c);
        int mn = Math.min(b, d);
        if (mx < mn) {
            mn -= mx;
        } else {
            mn = 0;
        }
        System.out.printf("%d\n", mn);
    }
}