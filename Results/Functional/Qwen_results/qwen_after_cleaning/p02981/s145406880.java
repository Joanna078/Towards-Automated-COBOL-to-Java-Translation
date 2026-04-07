import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input line
        String ln = scanner.nextLine();
        
        // Splitting the input into components
        String[] parts = ln.split(" ");
        int N = Integer.parseInt(parts[0]);
        int A = Integer.parseInt(parts[1]);
        int B = Integer.parseInt(parts[2]);
        
        // Calculating the answer
        int ans = Math.min(A * N, B);
        
        // Formatting the output
        System.out.printf("%d%n", ans);
        
        scanner.close();
    }
}