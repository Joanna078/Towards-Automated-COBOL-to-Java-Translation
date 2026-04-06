import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String inp = scanner.nextLine();
        
        int a = 0;
        int b = 0;
        int n = 0;
        int re = 0;
        
        // Find the first space
        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;
        
        // Extract substring A
        a = Integer.parseInt(inp.substring(0, temp1).trim());
        
        // Skip spaces
        temp1++; // Correctly skip one space
        
        // Find the second space
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        
        // Calculate length of substring B
        n = temp2 - temp1;
        
        // Extract substring B
        b = Integer.parseInt(inp.substring(temp1, temp1 + n).trim());
        
        // Compare A and B
        if (a >= b) {
            re = a - b;
        } else {
            re = 0;
        }
        
        // Output result
        System.out.println(re);
        
        scanner.close();
    }
}