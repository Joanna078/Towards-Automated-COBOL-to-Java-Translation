import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter value: ");
        String ln = scanner.nextLine();
        
        // Data initialization
        int A = Integer.parseInt(ln.split(" ")[0]);
        int B = Integer.parseInt(ln.split(" ")[1]);
        int ans = 0;
        int cur = 1;
        
        // Logic
        while (B >= cur) {
            ans++;
            cur += A - 1;
        }
        
        // Output
        System.out.println(String.format("%d", ans));
        
        scanner.close();
    }
}