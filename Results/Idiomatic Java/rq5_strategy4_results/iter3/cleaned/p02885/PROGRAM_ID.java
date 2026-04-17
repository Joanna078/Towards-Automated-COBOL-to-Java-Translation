import java.util.Scanner;

public class ProgramId {

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
            long A = Long.parseLong(parts[0]);
            long B = Long.parseLong(parts[1]);
            
            if (2 * B < A) {
                long ans = A - 2 * B;
                System.out.println(ans);
            } else {
                System.out.println(0);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}