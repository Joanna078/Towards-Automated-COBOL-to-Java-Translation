```java
import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (A): ");
        int a = scanner.nextInt();

        System.out.print("Enter height (H): ");
        int h = scanner.nextInt();

        double ans = calculateTriangleArea(a, h);
        System.out.printf("Area (ANS): %.2f%n", ans);

        scanner.close();
    }

    private static double calculateTriangleArea(int base, int height) {
        return (base + height) * height / 2.0;
    }
}
```