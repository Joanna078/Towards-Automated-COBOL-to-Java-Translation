import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        String s = scanner.nextLine();
        
        // Split the input string into two parts
        String[] parts = s.split(" ");
        String a = parts[0].trim();
        String b = parts[1].trim();
        
        // Concatenate and convert to long
        String concatenated = a + b;
        long v = Long.parseLong(concatenated);
        
        // Initialize display value
        String disp = "No";
        
        // Loop to check if there exists an integer whose square is equal to v
        for (long i = 1; i < 1000; i++) {
            long r = i * i;
            if (r == v) {
                disp = "Yes";
                break;
            }
        }
        
        // Display the result
        System.out.println(disp);
        
        scanner.close();
    }
}