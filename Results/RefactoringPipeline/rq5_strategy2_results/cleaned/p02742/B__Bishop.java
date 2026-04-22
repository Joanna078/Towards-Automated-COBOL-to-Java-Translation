import java.util.Scanner;

public class Bishop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter two integers.");
            return;
        }

        try {
            int H = Integer.parseInt(parts[0].trim());
            int W = Integer.parseInt(parts[1].trim());

            int result = calculate(H, W);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }

    private static int calculate(int H, int W) {
        if (H == 1 || W == 1) {
            return 0;
        }

        int S1 = H / 2;
        int S2 = W / 2;

        if (H == S1 * 2 || W == S2 * 2) {
            return (H * W) / 2;
        } else {
            return (H * W) / 2 + 1;
        }
    }
}