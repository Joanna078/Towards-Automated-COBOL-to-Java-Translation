import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ab = new int[2];
        for (int i = 0; i < 2; i++) {
            ab[i] = sc.nextInt();
        }
        int diff = ab[1] - ab[0];
        int sum = 0;
        for (int i = 1; i < diff; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}