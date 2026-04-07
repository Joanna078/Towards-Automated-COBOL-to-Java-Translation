import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        int x = Math.min(A, B);
        int y = Math.min(C, D);

        String answer = String.format("%d", x + y);
        System.out.println(answer);
    }
}