import java.util.Scanner;

public class ABC_056_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter input (format: XX XX): ");
        String inp = scanner.nextLine();
        
        // Parsing input
        String[] parts = inp.split("\\s+");
        int w = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[1]); // Corrected index from 2 to 1
        
        // Swap if b is less than a
        if (b < a) {
            int temp = b;
            b = a;
            a = temp;
        }
        
        // Add w to a
        a += w;
        
        // Check if b is less than a
        if (b < a) {
            System.out.println("ZERO");
        } else {
            // Subtract a from b
            b -= a;
            
            // Convert result to string
            String zs = String.format("%06d", b);
            
            // Reverse the string
            StringBuilder sb = new StringBuilder(zs).reverse();
            String ans = sb.toString();
            
            // Display the result
            System.out.println(ans.substring(0, ans.length()));
        }
        
        scanner.close();
    }
}