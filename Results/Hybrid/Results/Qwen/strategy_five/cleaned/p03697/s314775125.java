import java.util.Scanner;

public class ABC_063_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter three characters separated by space: ");
        String inp = scanner.nextLine();
        
        // Parse input
        String[] parts = inp.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Calculate
        int tmp = a + b;
        
        // Format result
        String zs = String.format("%03d", tmp);
        String ans = "";
        
        // Reverse string
        for (int i = zs.length() - 1; i >= 0; i--) {
            ans += zs.charAt(i);
        }
        
        // Output
        if (tmp >= 100) {
            System.out.println("error");
        } else {
            System.out.println(ans);
        }
        
        scanner.close();
    }
}