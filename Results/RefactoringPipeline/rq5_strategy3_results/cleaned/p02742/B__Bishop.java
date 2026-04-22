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
            int h = Integer.parseInt(parts[0].trim());
            int w = Integer.parseInt(parts[1].trim());
            int result = calculateResult(h, w);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }

    private static int calculateResult(int h, int w) {
        if (h == 1 || w == 1) {
            return 0;
        }

        int s1 = h / 2;
        int s2 = w / 2;

        if (h == s1 * 2 || w == s2 * 2) {
            return (h * w) / 2;
        } else {
            return (h * w) / 2 + 1;
        }
    }
}