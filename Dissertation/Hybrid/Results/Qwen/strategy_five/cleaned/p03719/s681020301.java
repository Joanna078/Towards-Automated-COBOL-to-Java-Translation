import java.util.Scanner;

public class ABC_061_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        String input = scanner.nextLine();
        
        // Split the input into individual strings
        String[] parts = input.split("\\s+");
        
        // Convert the string parts to integers
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        
        // Check the condition and display the result
        if (a <= c && c <= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}