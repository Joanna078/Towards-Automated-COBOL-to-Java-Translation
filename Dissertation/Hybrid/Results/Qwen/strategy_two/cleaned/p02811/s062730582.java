import java.util.Scanner;

public class ABC150a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input section
        int k = scanner.nextInt();
        int x = scanner.nextInt();

        // Processing section
        k *= 500;
        if (k >= x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}