import java.util.Scanner;

public class ABC_077_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter a number: ");
        double n = scanner.nextDouble();
        
        // Processing section
        n = Math.sqrt(n);
        n = Math.pow(n, 2);
        
        String zs = String.format("%11d", (int)n).replace(' ', '0');
        
        String ans = unans(zs);
        
        // Output section
        System.out.println(ans.trim());
        
        scanner.close();
    }
    
    // UNANS section
    private static String unans(String zs) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            } else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}