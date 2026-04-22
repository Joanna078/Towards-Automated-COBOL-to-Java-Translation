import java.util.Scanner;

public class ABC_052_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter input (A B C D): ");
        String inp = scanner.nextLine();
        
        // Working storage variables
        int a, b, c, d;
        String ans = "";
        long zs;
        
        // Parsing input
        String[] parts = inp.split("\\s+");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
        c = Integer.parseInt(parts[2]);
        d = Integer.parseInt(parts[3]);
        
        // Logic section
        b *= a;
        d *= c;
        b = Math.max(b, d);
        zs = b;
        
        // Output section
        unans(zs, ans);
        
        System.out.println(ans.trim());
    }
    
    private static void unans(long zs, String ans) {
        // Convert long to string with spaces
        String zsStr = String.format("%08d", zs);
        
        // Unstring operation
        for (char ch : zsStr.toCharArray()) {
            if (ch != ' ') {
                ans += ch;
            }
        }
    }
}