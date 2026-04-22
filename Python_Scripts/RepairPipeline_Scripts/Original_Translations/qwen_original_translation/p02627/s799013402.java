import java.util.Scanner;

public class ProgramId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input character
        char a = scanner.next().charAt(0);
        
        // Check if the character is uppercase or lowercase
        if (a >= 'A' && a <= 'Z') {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
        
        scanner.close();
    }
}