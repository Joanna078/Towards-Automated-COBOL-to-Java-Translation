import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        String inp;
        int a, b, wa, x, ama;
        
        // Create scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        inp = scanner.nextLine();
        
        // Split input into two parts
        String[] parts = inp.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
        
        // Compute the average
        wa = a + b;
        x = wa / 2;
        ama = wa % 2;
        
        // Adjust if remainder is not zero
        if (ama != 0) {
            x += 1;
        }
        
        // Display the result
        System.out.println(x);
        
        // Close the scanner
        scanner.close();
    }
}