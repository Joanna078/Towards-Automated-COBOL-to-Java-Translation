import java.util.Scanner;

public class CubeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int ans = n * n * n;
        System.out.println(ans);
    }
}