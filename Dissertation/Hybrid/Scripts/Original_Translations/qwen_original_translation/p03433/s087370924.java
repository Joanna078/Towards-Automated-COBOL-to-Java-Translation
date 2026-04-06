import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());

        // Process
        int g1 = a1 / 500;
        int r1 = a1 % 500;

        // Output
        if (r1 <= a2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}