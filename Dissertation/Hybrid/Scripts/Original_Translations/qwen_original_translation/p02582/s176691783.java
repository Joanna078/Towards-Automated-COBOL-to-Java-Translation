import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        String s = scanner.nextLine();
        
        int out;
        
        // Evaluate logic
        if (s.equals("RRR")) {
            out = 3;
        } else if ((s.substring(0, 2).equals("RR") || s.charAt(1) == 'R')) {
            out = 2;
        } else if (s.charAt(0) == 'R') {
            out = 1;
        } else {
            out = 0;
        }
        
        // Display output
        System.out.println(out);
        
        scanner.close();
    }
}