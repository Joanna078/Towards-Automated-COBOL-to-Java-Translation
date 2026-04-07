import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter a string: ");
        String ln = scanner.nextLine();
        
        // Split the input into two parts
        String[] parts = ln.split("\\s+");
        if (parts.length != 2) {
            System.out.println("Invalid input format.");
            return;
        }
        
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        
        // Compute the result
        int ans = 0;
        if (2 * B < A) {
            ans = A - 2 * B;
        }
        
        // Display the result
        System.out.println(ans);
        
        scanner.close();
    }
}