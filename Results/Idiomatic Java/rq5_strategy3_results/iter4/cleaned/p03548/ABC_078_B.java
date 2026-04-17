import java.util.Scanner;

public class ABC_078_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for X, Y, Z separated by spaces: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        if (parts.length != 3) {
            System.out.println("Please enter exactly three numbers.");
            return;
        }

        try {
            int X = Integer.parseInt(parts[0]);
            int Y = Integer.parseInt(parts[1]);
            int Z = Integer.parseInt(parts[2]);

            int D = (X - Z) / (Y + Z);
            String ZS = String.format("%06d", D);
            String ans = ZS.substring(1);

            System.out.println(ans);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}