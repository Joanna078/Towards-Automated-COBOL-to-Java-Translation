import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int max = 0;
        int current = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'I') {
                current++;
            } else {
                current--;
            }
            max = Math.max(max, current);
        }
        System.out.println(max);
    }
}