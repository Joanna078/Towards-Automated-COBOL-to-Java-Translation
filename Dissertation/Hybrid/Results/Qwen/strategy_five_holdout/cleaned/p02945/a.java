import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input line from user
        String ln = scanner.nextLine();
        
        // Splitting the input into two parts
        String[] parts = ln.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        
        // Calculating the maximum of three values: sum, difference, and product
        int ans = Math.max(Math.max(A + B, A - B), A * B);
        
        // Output the result with leading zeros if necessary
        System.out.printf("%+010d%n", ans);
        
        scanner.close();
    }
}