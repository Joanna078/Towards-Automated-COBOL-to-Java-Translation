import java.util.Scanner;

public class ABC_074_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Working storage variables
        int n;
        int a;

        // Input section
        System.out.print("Enter N: ");
        n = scanner.nextInt();
        System.out.print("Enter A: ");
        a = scanner.nextInt();

        // Logic section
        n = (int) Math.pow(n, 2);
        n -= a;

        // Convert result to string
        String zs = String.format("%06d", n);

        // Output section
        System.out.println(zs.trim());

        scanner.close();
    }
}