import java.util.*;
public class Atcoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3;
        int r;
        int g;
        int r2;
        if (r > 0) {
            a3 = a2 - a1;
        } else {
            a3 = a2 + a1;
        }
        System.out.println(a3);
    }
}