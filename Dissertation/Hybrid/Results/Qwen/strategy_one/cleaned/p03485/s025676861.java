import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        String inp;
        int a, b, wa, x;
        
        // Create scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.println("Enter two numbers separated by space:");
        inp = scanner.nextLine();
        
        // Split input into two parts
        String[] parts = inp.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
        
        // Compute the average
        wa = a + b;
        x = wa / 2;
        
        // Display the result
        System.out.println(x);
        
        // Close the scanner
        scanner.close();
    }
}