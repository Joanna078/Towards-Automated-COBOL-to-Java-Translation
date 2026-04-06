import java.util.Scanner;

public class ABC_049_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Working storage
        int h;
        int w;
        String c;
        int i;
        
        // Unstringing input
        String[] parts = inp.split("\\s+");
        h = Integer.parseInt(parts[0]);
        w = Integer.parseInt(parts[1]);
        
        // Loop
        for (i = 1; i <= h; i++) {
            System.out.print("Enter string: ");
            c = scanner.nextLine();
            System.out.println(c);
            System.out.println(c);
        }
        
        scanner.close();
    }
}