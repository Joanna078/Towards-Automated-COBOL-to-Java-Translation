import java.util.Scanner;

public class ABirthday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length != 2) {
            System.out.println(":(");
            return;
        }

        try {
            int inA = Integer.parseInt(parts[0]);
            int inB = Integer.parseInt(parts[1]);

            if (inA <= 8 && inB <= 8) {
                System.out.println("Yay!");
            } else {
                System.out.println(":(");
            }
        } catch (NumberFormatException e) {
            System.out.println(":(");
        }
    }
}