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
        
        String zs = String.format("%011d", (int)n);
        
        String ans = unans(zs);
        
        // Output section
        System.out.println(ans.replaceAll("^0+", ""));
        
        scanner.close();
    }
    
    // UNANS section
    private static String unans(String zs) {
        StringBuilder sb = new StringBuilder();
        boolean firstSpace = true;
        for (char c : zs.toCharArray()) {
            if (c != '0' || !firstSpace) {
                sb.append(c);
                firstSpace = false;
            }
        }
        return sb.toString();
    }
}