import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        String ln = scanner.nextLine();
        
        // Trim the input and display the result
        System.out.println(ln.trim());
        
        scanner.close();
    }
}