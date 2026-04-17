import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        long qt = N / 1000;
        long rm = N % 1000;
        long num = 1000 - rm;
        long ans = num % 1000;

        System.out.printf("%03d%n", ans);
    }
}