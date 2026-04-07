import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long lucas = fibonacci(N);
        System.out.println(lucas);
    }
static long fibonacci(int n) {
    if (n == 1 || n == 2) {
        return 1;
    } else {
        long prevPrev = 1;
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
