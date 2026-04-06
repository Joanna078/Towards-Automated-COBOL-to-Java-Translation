import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        String[] arr = ln.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        boolean flg = false;
        if (a == b && b != c) {
            flg = true;
        }
        if (b == c && c != a) {
            flg = true;
        }
        if (c == a && a != b) {
            flg = true;
        }
        System.out.println(flg ? "Yes" : "No");
    }
}
