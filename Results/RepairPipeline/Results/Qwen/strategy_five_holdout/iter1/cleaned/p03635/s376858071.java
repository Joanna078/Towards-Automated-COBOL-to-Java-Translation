import java.util.Scanner;

public class ABC_069_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter input (format: XX YY): ");
        String inp = scanner.nextLine();
        
        // Parse input
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]) - 1;
        int m = Integer.parseInt(parts[1]) - 1;
        
        // Calculate product
        int tmp = n * m;
        
        // Convert result to string with leading zeros
        String zs = String.format("%04d", tmp);
        
        // Reverse the string
        StringBuilder ansBuilder = new StringBuilder(zs).reverse();
        String ans = ansBuilder.toString().replaceAll("^0*", "");
        
        // Output
        System.out.println(ans);
    }
}