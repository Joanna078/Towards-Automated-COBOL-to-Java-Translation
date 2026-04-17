import java.util.Scanner;

public class Program171C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        StringBuilder out = new StringBuilder(12);
        long m = n;
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 12; i > 0 && m > 0; i--) {
            m--;
            long amr = (m % 26) + 1;
            out.append(alpha.charAt((int) amr - 1));
            m /= 26;
        }

        System.out.println(out.toString().stripTrailing());
    }
}