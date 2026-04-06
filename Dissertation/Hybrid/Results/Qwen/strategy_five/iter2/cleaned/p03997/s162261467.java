import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int a;
        int b;
        int h;
        long ans;
        String ansStr;

        // Accept input
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();

        // Compute answer
        ans = ((long) a + b) * h / 2;

        // Format output
        ansStr = String.format("%9d", ans);

        // Display result
        System.out.println(ansStr);
    }
}