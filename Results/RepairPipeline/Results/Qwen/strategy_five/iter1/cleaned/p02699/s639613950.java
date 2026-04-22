import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        String ln = scanner.nextLine();
        
        // Split the input string into two parts
        String[] parts = ln.split("\\s+");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Input must contain exactly two space-separated numbers.");
        }
        
        int s = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);
        
        // Compare the two numbers and print the result
        if (w < s) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
        
        scanner.close();
    }
}