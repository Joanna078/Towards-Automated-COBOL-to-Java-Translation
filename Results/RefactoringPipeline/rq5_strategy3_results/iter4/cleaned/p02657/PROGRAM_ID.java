import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.trim().split("\\s+");
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter exactly two numbers.");
            return;
        }

        try {
            long A = Long.parseLong(parts[0]);
            long B = Long.parseLong(parts[1]);
            long ans = A * B;
            System.out.println(ans);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}