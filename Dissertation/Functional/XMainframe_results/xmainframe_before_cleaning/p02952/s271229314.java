import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            double logValue = Math.log10(i);
            int num = (int) (logValue + 1);
            if (num % 2 == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}