import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ab = new int[2];
        for (int i = 0; i < 2; i++) {
            ab[i] = sc.nextInt();
        }
        if (ab[0] * ab[1] % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
