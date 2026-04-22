import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int r = scanner.nextInt();
        scanner.close();

        double out = r * 2 * 3.1415926;
        System.out.printf("%.4f%n", out);
    }
}