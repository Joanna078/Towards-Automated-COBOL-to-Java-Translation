import java.util.Scanner;

public class ABC169C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Working storage variables
        String ab = scanner.nextLine();
        int a;
        double b;
        double ans;
        
        // Unstring AB delimited by space into A and B
        String[] parts = ab.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Double.parseDouble(parts[1]);
        
        // Compute ANS = A * B
        ans = a * b;
        
        // Display ANS
        System.out.printf("%016.0f%n", ans);
        
        scanner.close();
    }
}