import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        String ln = scanner.nextLine();
        
        // Split the input into two parts based on space
        String[] parts = ln.split("\\s+", 2);
        String s = parts.length > 0 ? parts[0] : "";
        String t = parts.length > 1 ? parts[1] : "";
        
        // Trim both parts and concatenate them
        String ans = t.trim() + s.trim();
        
        // Display the result
        System.out.println(ans.trim());
        
        scanner.close();
    }
}