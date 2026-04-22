import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int a;
        int b;
        int h;
        long ans;

        // Accept input
        System.out.print("Enter A: ");
        a = scanner.nextInt();
        System.out.print("Enter B: ");
        b = scanner.nextInt();
        System.out.print("Enter H: ");
        h = scanner.nextInt();

        // Compute answer
        ans = ((long) a + b) * h / 2;

        // Display result
        System.out.println(ans);
    }
}