import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        long[] tbl = new long[100002];
        
        for (int i = 1; i <= 9; i++) {
            tbl[i] = i;
        }
        
        int L = 9;
        for (int i = 1; i <= N && L < N; i++) {
            long x = tbl[i];
            long s = x / 10;
            int a = (int) (x % 10);
            
            if (a > 0) {
                tbl[++L] = x * 10 + a - 1;
            }
            
            tbl[++L] = x * 10 + a;
            
            if (a < 9) {
                tbl[++L] = x * 10 + a + 1;
            }
        }
        
        System.out.println(tbl[N]);
    }
}