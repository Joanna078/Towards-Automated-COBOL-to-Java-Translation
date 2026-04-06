import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.print("Enter a three-character string: ");
        String n = scanner.nextLine();
        
        // Check if any character is '7'
        boolean containsSeven = n.charAt(0) == '7' || n.charAt(1) == '7' || n.charAt(2) == '7';
        
        // Display result
        if (containsSeven) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}