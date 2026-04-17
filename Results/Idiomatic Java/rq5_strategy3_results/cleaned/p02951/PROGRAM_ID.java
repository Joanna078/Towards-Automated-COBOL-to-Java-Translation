import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Please enter exactly three numbers.");
            return;
        }

        try {
            long A = Long.parseLong(parts[0]);
            long B = Long.parseLong(parts[1]);
            long C = Long.parseLong(parts[2]);

            if (A < B + C) {
                long ans = B + C - A;
                System.out.printf("%d%n", ans);
            } else {
                System.out.println("0");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}