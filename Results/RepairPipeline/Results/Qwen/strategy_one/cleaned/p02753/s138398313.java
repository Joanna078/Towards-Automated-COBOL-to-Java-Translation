import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.println("Enter three characters:");
        String input = scanner.nextLine();
        
        if (input.length() != 3) {
            System.err.println("Input must be exactly three characters.");
            return;
        }
        
        char s1 = input.charAt(0);
        char s2 = input.charAt(1);
        char s3 = input.charAt(2);
        
        // Processing section
        if ((s1 == s2) && (s2 == s3)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
        // Exit section
        scanner.close();
    }
}