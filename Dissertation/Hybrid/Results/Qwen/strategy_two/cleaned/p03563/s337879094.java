import java.util.Scanner;

public class ABC_076_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Working storage variables
        int r;
        int g;

        // Input section
        System.out.print("Enter R: ");
        r = scanner.nextInt();
        System.out.print("Enter G: ");
        g = scanner.nextInt();

        // Logic section
        r -= g;
        r += g;

        // Output section
        System.out.println(r);
    }
}