import java.util.Scanner;

public class ABC_067_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        // Split the input into two parts
        String[] parts = input.split("\\s+");
        
        // Parse the input parts into integers
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Calculate modulo values
        int moda = a % 3;
        int modb = b % 3;
        int modab = (a + b) % 3; // Corrected line
        
        // Check conditions and display result
        if (moda == 0 || modb == 0 || modab == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
        
        scanner.close();
    }
}