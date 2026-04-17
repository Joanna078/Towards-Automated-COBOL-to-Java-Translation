import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        String inp = scanner.nextLine().trim();
        
        if (inp.length() != 3 || !inp.matches("\\d{3}")) {
            System.out.println("Invalid input. Please enter a three-digit number.");
            return;
        }

        int r = Integer.parseInt(inp);
        int ans = r * r;
        System.out.printf("%06d%n", ans);
    }
}