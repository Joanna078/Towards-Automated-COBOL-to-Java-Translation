import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter a three-digit number: ");
        String inp = scanner.nextLine().trim();
        
        // Ensure the input is exactly three characters long
        if (inp.length() != 3 || !inp.matches("\\d{3}")) {
            System.out.println("Input must be exactly three characters long.");
            return;
        }
        
        // Convert input to integer
        int r = Integer.parseInt(inp);
        
        // Compute the square
        int ans = r * r;
        
        // Display the result
        System.out.printf("%d%n", ans);
        
        scanner.close();
    }
}