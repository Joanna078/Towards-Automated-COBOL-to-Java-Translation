import java.util.*;

public class Atcoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        int remainder = n % m;
        int quotient = n / m;

        if (remainder > 0) {
            quotient++;
        }

        System.out.println(quotient);
    }
}