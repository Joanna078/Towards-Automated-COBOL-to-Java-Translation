import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double w1;
        int n2w = 10;
        int gk = 0;
        int m1 = 0;
        int m2 = 0;
        int i;
        int out;

        for (i = 1; i <= 5; i++) {
            n = scanner.nextInt();
            w1 = ((n / 10) % 10) * 10 + 9; // Corrected to get N2
            w1 = w1 * 10;
            if (n % 10 > 0 && n % 10 < n2w) { // Corrected condition to check N2
                gk += m1 - m2 + n;
                m1 = (int) w1;
                m2 = n;
                n2w = n % 10; // Corrected to update N2W
            } else {
                gk += w1;
            }
        }

        out = gk;
        System.out.println(String.format("%03d", out)); // Corrected to format output as ZZ9
    }
}