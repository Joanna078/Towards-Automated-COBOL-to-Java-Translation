import java.util.Scanner;

public class Test129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        String input = scanner.nextLine();
        
        // Data division
        int p, q, r;
        String[] parts = input.split("\\s+");
        p = Integer.parseInt(parts[0]);
        q = Integer.parseInt(parts[1]);
        r = Integer.parseInt(parts[2]);
        
        // Processing section
        int a1 = p + q;
        int a2 = q + r;
        int a3 = p + r;
        
        int ans;
        if ((a1 < a2) && (a1 < a3)) {
            ans = a1;
        } else if ((a2 < a1) && (a2 < a3)) {
            ans = a2;
        } else if ((a3 < a1) && (a3 < a2)) {
            ans = a3;
        } else {
            ans = 0; // This line should never be reached due to the problem constraints
        }
        
        // Output section
        System.out.println(ans);
        
        scanner.close();
    }
}