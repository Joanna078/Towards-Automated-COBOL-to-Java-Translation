import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input line
        String ln = scanner.nextLine();
        
        // Splitting the input into components
        String[] parts = ln.split(" ");
        int N = Integer.parseInt(parts[0]);
        int D = Integer.parseInt(parts[1]);
        
        // Calculating the answer
        double ans = (N + 2 * D) / (2 * D + 1.0);
        
        // Formatting the output
        System.out.printf("%.0f%n", ans);
        
        scanner.close();
    }
}