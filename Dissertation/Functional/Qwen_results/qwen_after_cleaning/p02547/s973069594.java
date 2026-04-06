import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of inputs
        int n = Integer.parseInt(scanner.nextLine());
        
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            // Read the integer input
            String intStr = scanner.nextLine();
            
            // Split the string into two parts
            String[] parts = intStr.split(" ");
            if (parts.length != 2) continue;
            
            int d1 = Integer.parseInt(parts[0]);
            int d2 = Integer.parseInt(parts[1]);
            
            // Check if the digits are equal
            if (d1 == d2) {
                cnt++;
                
                // If three pairs are found, display "Yes" and exit
                if (cnt == 3) {
                    System.out.println("Yes");
                    return;
                }
            } else {
                cnt = 0;
            }
        }
        
        // If not three pairs are found, display "No"
        if (cnt != 3) {
            System.out.println("No");
        }
        
        scanner.close();
    }
}