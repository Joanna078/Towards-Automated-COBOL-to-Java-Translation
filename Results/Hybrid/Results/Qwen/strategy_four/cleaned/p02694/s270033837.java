import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a string:");
        String inp = scanner.nextLine();
        
        int len = inp.length();
        long x = 0;
        double y = 100;
        int i = 0;
        
        if (len <= 18) {
            x = Long.parseLong(inp);
            
            while (i <= 3759 && y < x) {
                y += y * 0.01;
                i++;
            }
        } else {
            i = 3760;
        }
        
        // Output
        System.out.printf("%d%n", i);
        
        scanner.close();
    }
}