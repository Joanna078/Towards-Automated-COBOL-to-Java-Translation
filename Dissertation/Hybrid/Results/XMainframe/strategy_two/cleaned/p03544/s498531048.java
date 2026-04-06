import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long lucas = lucasNumber(N);
        System.out.println(lucas);
    }
    
    static long lucasNumber(int n) {
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 1;
        } else {
            long prevPrev = 2;
            long prev = 1;
            long current = 0;
            for (int i = 3; i <= n; i++) {
                current = prev + prevPrev;
                prevPrev = prev;
                prev = current;
            }
            return current;
        }
    }
}