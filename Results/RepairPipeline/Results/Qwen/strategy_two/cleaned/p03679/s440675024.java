import java.util.Scanner;

public class ABC_065_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Split the input string into components
        String[] parts = inp.split("\\s+");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly three space-separated values.");
        }
        
        int x = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);
        
        // Perform the subtraction
        b -= a;
        
        // Determine the output based on the result
        if (b <= 0) {
            System.out.println("delicious");
        } else if (b <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
        
        scanner.close();
    }
}