import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        String inp = scanner.nextLine();
        
        // Split input string into components
        String[] parts = inp.split(" ");
        
        // Parse components into double values
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);
        
        // Compute square roots
        a = Math.sqrt(a);
        b = Math.sqrt(b);
        c = Math.sqrt(c);
        
        // Compute left and right sides of the inequality
        double lef = a + b;
        double rig = c;
        
        // Compare and display result
        if (lef < rig) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}