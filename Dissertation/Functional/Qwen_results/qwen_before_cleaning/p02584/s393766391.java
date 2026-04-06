import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter the input string:");
        String inp = scanner.nextLine();
        
        // Data storage
        int x = Integer.parseInt(inp.split(" ")[0]);
        int k = Integer.parseInt(inp.split(" ")[1]);
        int d = Integer.parseInt(inp.split(" ")[2]);
        
        // Processing
        int wx = x;
        int s = wx / d;
        int r = wx % d;
        
        if (s > 0) {
            if (x > 0) {
                if (s > k) {
                    int za = x - k * d;
                    k = 0;
                } else {
                    int za = x - s * d;
                    k -= s;
                }
            } else {
                if (s > k) {
                    int za = x + k * d;
                    k = 0;
                } else {
                    int za = x + s * d;
                    k -= s;
                }
            }
        } else {
            int za = x;
        }
        
        if (k > 0) {
            s = k / 2;
            r = k % 2;
            if (r == 0) {
                int out = za;
                System.out.println(out);
            } else {
                if (za > 0) {
                    int out = za - d;
                    System.out.println(out);
                } else {
                    int out = za + d;
                    System.out.println(out);
                }
            }
        } else {
            int out = za;
            System.out.println(out);
        }
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program. It reads input from the user, processes it according to the specified rules, and prints the output. The code uses Java 17 features and includes comments for clarity where necessary.