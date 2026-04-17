import java.util.Scanner;

public class ATCODER {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String indata = scanner.nextLine();
            String[] parts = indata.split("\\s+");
            long n = Long.parseLong(parts[0]);
            long m = Long.parseLong(parts[1]);

            long g = n / m;
            long d = n % m;
            long res = g;

            if (d > 0) {
                res += 1;
            }

            System.out.printf("%03d%n", res);
        }
    }
}