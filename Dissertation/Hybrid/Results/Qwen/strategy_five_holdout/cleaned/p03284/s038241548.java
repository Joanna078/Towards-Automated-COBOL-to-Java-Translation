import java.util.Scanner;

public class Crackers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        
        // Parsing input
        String[] parts = inp.split("\\s+");
        int inN = Integer.parseInt(parts[0]);
        int inK = Integer.parseInt(parts[1]);
        
        // Calculation
        int maisu = inN / inK;
        int amari = inN % inK;
        
        // Output based on condition
        if (amari == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        
        scanner.close();
    }
}