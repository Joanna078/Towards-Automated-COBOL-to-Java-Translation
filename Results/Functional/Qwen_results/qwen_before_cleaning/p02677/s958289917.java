import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        // Parse input
        String[] parts = inp.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int h = Integer.parseInt(parts[2]);
        int m = Integer.parseInt(parts[3]);

        // Calculate angles
        double ak = h * 30 + m * 0.5;
        double bk = m * 6;
        double sk = ak - bk;
        if (sk > 180) {
            sk = 360 - sk;
        }

        // Calculate count based on angle
        double cnt;
        if (sk == 0) {
            cnt = a - b;
        } else if (sk == 90) {
            cnt = Math.sqrt(a * a + b * b);
        } else if (sk == 180) {
            cnt = a + b;
        } else {
            double rad = Math.cos(sk * 3.141592654518 / 180);
            cnt = Math.sqrt((a * a + b * b) - (2 * a * b * rad));
        }

        // Output result
        System.out.printf("%.10f%n", cnt);
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program while using modern Java 17 features. It reads input from the user, parses it, calculates the required values, and outputs the result formatted as specified.