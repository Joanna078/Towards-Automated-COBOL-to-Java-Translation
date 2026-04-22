import java.util.Scanner;

public class SortNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of iterations: ");
        int n = scanner.nextInt();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter two digits separated by space: ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split("\\s+");

            if (parts.length != 2 || !parts[0].matches("\\d") || !parts[1].matches("\\d")) {
                System.out.println("Invalid input. Please enter two digits.");
                continue;
            }

            int d1 = Integer.parseInt(parts[0]);
            int d2 = Integer.parseInt(parts[1]);

            if (d1 == d2) {
                cnt++;
                if (cnt == 3) {
                    System.out.println("Yes");
                    break;
                }
            } else {
                cnt = 0;
            }
        }

        if (cnt != 3) {
            System.out.println("No");
        }

        scanner.close();
    }
}