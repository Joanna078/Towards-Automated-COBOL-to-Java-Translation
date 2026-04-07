import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a string:");
        String inp = scanner.nextLine();
        
        int len = inp.split(" ").length;
        long x = 0;
        double y = 100;
        int i = 1;
        
        if (len <= 18) {
            try {
                x = Long.parseLong(inp);
                
                while (i <= 3759 && y < x) {
                    y += y * 0.01;
                    i++;
                }
            } catch (NumberFormatException e) {
                // Handle the case where the input cannot be parsed as a long
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } else {
            i = 3760;
        }
        
        // Output
        System.out.printf("%d%n", i);
        
        scanner.close();
    }
}