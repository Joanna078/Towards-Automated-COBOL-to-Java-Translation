import java.util.*;
public class Atcoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        if (a2 <= a1 && a3 <= a1) {
            System.out.println(10 * a1 + a2 + a3);
        } else if (a1 <= a2 && a3 <= a2) {
            System.out.println(10 * a2 + a1 + a3);
        } else {
            System.out.println(10 * a3 + a2 + a1);
        }
    }
}