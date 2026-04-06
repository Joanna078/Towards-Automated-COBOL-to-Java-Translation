import java.util.Scanner;

public class ABC_057_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter input (A B): ");
        String inp = scanner.nextLine();
        
        // Working storage section
        int a = 0;
        int b = 0;
        int ans = 0;
        int zs = 0;
        char dummy = ' ';
        
        // Procedure division
        String[] parts = inp.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
        
        a += b;
        
        if (a >= 24) {
            a -= 24;
        }
        
        zs = a;
        
        unans(zs, dummy, ans);
        
        System.out.println(ans);
    }

    private static void unans(int zs, char dummy, int ans) {
        StringBuilder sb = new StringBuilder(Integer.toString(zs));
        if (sb.length() > 0) {
            dummy = sb.charAt(0);
            ans = Character.getNumericValue(sb.charAt(0));
        }
    }
}