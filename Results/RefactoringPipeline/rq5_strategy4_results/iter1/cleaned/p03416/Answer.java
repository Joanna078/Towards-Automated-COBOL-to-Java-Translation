import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        String aStr = scanner.nextLine();
        String bStr = scanner.nextLine();
        
        // Convert strings to integers
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        
        int ans = 0;
        
        // Loop from a to b
        for (int i = a; i <= b; i++) {
            String iStr = String.valueOf(i);
            if (iStr.charAt(0) == iStr.charAt(4) && iStr.charAt(1) == iStr.charAt(3)) {
                ans++;
            }
        }
        
        // Output the result
        System.out.printf("%04d%n", ans);
        
        scanner.close();
    }
}