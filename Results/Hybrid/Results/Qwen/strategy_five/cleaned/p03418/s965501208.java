import java.util.Scanner;

public class Kyopuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String inStr = scanner.nextLine();
        
        // Splitting the input string into components
        String[] parts = inStr.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        
        long viewRes;
        
        if (k == 0) {
            viewRes = (long) n * n;
        } else {
            long res = 0;
            long i = k + 1;
            while (i <= n) {
                long q = n / i;
                long r = n % i;
                res += (i - k) * q + Math.max(r - k + 1, 0);
                i++;
            }
            viewRes = res;
        }
        
        // Output the result
        System.out.printf("%d%n", viewRes);
        
        scanner.close();
    }
}