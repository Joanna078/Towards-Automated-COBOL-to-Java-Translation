import java.util.*;
public class Atcoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int g1, r1;
        r1 = a1 % 500;
        g1 = a1 / 500;
        if (r1 <= a2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}