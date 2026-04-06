import java.util.Scanner;

public class ABirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        System.out.println("Enter two numbers separated by space:");
        String input = scanner.nextLine();
        
        // Split the input into two parts
        String[] parts = input.split("\\s+");
        
        // Parse the parts into integers
        int inA = Integer.parseInt(parts[0]);
        int inB = Integer.parseInt(parts[1]);
        
        // Check the conditions and display the result
        if ((inA <= 8) && (inB <= 8)) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
        
        scanner.close();
    }
}