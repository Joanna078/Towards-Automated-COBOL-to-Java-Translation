import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String inp = scanner.nextLine();
        
        // Parsing input
        String[] parts = inp.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Calculation
        int p1 = Math.round(a * 12.5f);
        int p2 = b * 10;
        int pri = (p1 > p2) ? p1 : p2;
        int t1 = (int) Math.round(pri * 0.08);
        int t2 = (int) Math.round(pri * 0.1);
        
        // Output
        if (t1 != a || t2 != b) {
            System.out.println("-1");
        } else {
            System.out.printf("%04d%n", pri);
        }
        
        scanner.close();
    }
}