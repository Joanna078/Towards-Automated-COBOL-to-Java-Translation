import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        double ans = n / 2.0 + 0.9;
        System.out.printf("%.0f%n", ans);
    }
}