import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int p1 = (int) Math.round(a * 12.5);
        int p2 = b * 10;
        int pri;
        if (p1 > p2) {
            pri = p1;
        } else {
            pri = p2;
        }
        int t1 = (int) Math.round(pri * 0.08);
        int t2 = (int) Math.round(pri * 0.1);
        int outPri;
        if (t1 != a || t2 != b) {
            outPri = -1;
        } else {
            outPri = pri;
        }
        System.out.println(outPri);
    }
}
