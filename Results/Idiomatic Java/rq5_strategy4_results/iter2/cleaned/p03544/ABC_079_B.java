import java.util.Scanner;

public class ABC_079_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        long lucasNumber = calculateLucasNumber(n);
        String formattedLucas = String.format("%018d", lucasNumber).stripTrailing();

        System.out.println(formattedLucas);
    }

    private static long calculateLucasNumber(int n) {
        if (n == 1) {
            return 1;
        }

        long ppr = 2;
        long pr = 1;
        long lucas = 0;

        for (int i = 2; i <= n; i++) {
            lucas = ppr + pr;
            ppr = pr;
            pr = lucas;
        }

        return lucas;
    }
}