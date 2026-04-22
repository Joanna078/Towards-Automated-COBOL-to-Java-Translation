import java.util.Scanner;

public class ABC150a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for K: ");
        int K = scanner.nextInt();

        System.out.print("Enter value for X: ");
        int X = scanner.nextInt();

        K *= 500;

        if (K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}