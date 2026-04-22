import java.util.Scanner;

public class ABC_067_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter two numbers.");
            return;
        }

        try {
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);

            int moda = a % 3;
            int modb = b % 3;
            int sum = a + b;
            int modab = sum % 3;

            if (moda == 0 || modb == 0 || modab == 0) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}