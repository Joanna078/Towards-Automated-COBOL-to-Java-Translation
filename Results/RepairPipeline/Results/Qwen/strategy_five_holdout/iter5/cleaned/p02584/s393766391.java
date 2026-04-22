import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter the input string:");
        String inp = scanner.nextLine();
        
        // Data storage
        long x = Long.parseLong(inp.split(" ")[0]);
        long k = Long.parseLong(inp.split(" ")[1]);
        long d = Long.parseLong(inp.split(" ")[2]);
        
        // Processing
        long wx = x;
        long s = wx / d;
        long r = wx % d;
        long za = 0; // Initialize za
        
        if (s > 0) {
            if (x > 0) {
                if (s > k) {
                    za = x - k * d;
                    k = 0;
                } else {
                    za = x - s * d;
                    k -= s;
                }
            } else {
                if (s > k) {
                    za = x + k * d;
                    k = 0;
                } else {
                    za = x + s * d;
                    k -= s;
                }
            }
        } else {
            za = x;
        }
        
        if (k > 0) {
            s = k / 2;
            r = k % 2;
            if (r == 0) {
                za = za;
            } else {
                if (za > 0) {
                    za = za - d;
                } else {
                    za = za + d;
                }
            }
        }
        
        // Output
        System.out.println(String.format("%016d", za).replaceFirst("^0+(?!$)", ""));
    }
}