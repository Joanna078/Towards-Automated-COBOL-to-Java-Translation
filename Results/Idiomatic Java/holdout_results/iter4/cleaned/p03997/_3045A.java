import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (A): ");
        int base = scanner.nextInt();

        System.out.print("Enter height (H): ");
        int height = scanner.nextInt();

        double area = calculateTriangleArea(base, height);
        System.out.printf("Area (ANS): %.2f%n", area);

        scanner.close();
    }

    private static double calculateTriangleArea(int base, int height) {
        return (base + height) * height / 2.0;
    }
}