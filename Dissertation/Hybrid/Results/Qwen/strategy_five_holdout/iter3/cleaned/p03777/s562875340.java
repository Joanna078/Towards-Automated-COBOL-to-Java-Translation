import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter three characters: ");
        String inp = scanner.nextLine();
        
        // Process
        char a = inp.charAt(0);
        char b = inp.charAt(2); // Corrected index to match COBOL's unstring behavior
        
        if (a == 'H') {
            if (b == 'H') {
                System.out.println("H");
            } else {
                System.out.println("D");
            }
        } else {
            if (b == 'H') {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
        
        scanner.close();
    }
}