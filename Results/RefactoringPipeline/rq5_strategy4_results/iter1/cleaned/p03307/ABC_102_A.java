import java.util.Scanner;

public class ABC_102_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int x = n / 2;
        int d = n % 2;

        if (d != 0) {
            n *= 2;
        }

        String zs = String.format("%11d", n);
        String ans = zs.trim();

        System.out.println(ans);
    }
}