import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String ln = scanner.nextLine();
        String[] parts = ln.split(" ");
        int n, l;
        
        if (parts[0].startsWith("-")) {
            n = Integer.parseInt(parts[0].substring(1));
            n = -n;
        } else {
            n = Integer.parseInt(parts[0]);
        }
        
        if (parts[1].startsWith("-")) {
            l = Integer.parseInt(parts[1].substring(1));
            l = -l;
        } else {
            l = Integer.parseInt(parts[1]);
        }
        
        // Calculation
        int ans = (n * (2 * l + n - 1)) / 2;
        if (l > 0) {
            ans -= l;
        } else if (l + n - 1 < 0) {
            ans -= (l + n - 1);
        }
        
        // Output handling
        if (ans == 0) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
        
        scanner.close();
    }
}