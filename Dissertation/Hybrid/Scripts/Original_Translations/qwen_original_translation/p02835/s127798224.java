import java.util.Scanner;

public class ABC150A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input line
        String inputLine = scanner.nextLine();
        
        int p1 = 0;
        int a1 = 0, a2 = 0, a3 = 0;
        
        // Extract first number
        int p2 = 1;
        while (p1 + p2 < inputLine.length() && inputLine.charAt(p1 + p2) != ' ') {
            p2++;
        }
        a1 = Integer.parseInt(inputLine.substring(p1, p1 + p2));
        p1 += p2 + 1;
        
        // Extract second number
        p2 = 1;
        while (p1 + p2 < inputLine.length() && inputLine.charAt(p1 + p2) != ' ') {
            p2++;
        }
        a2 = Integer.parseInt(inputLine.substring(p1, p1 + p2));
        p1 += p2 + 1;
        
        // Extract third number
        p2 = 1;
        while (p1 + p2 < inputLine.length() && inputLine.charAt(p1 + p2) != ' ') {
            p2++;
        }
        a3 = Integer.parseInt(inputLine.substring(p1, p1 + p2));
        
        // Check if sum is less than or equal to 21
        if (a1 + a2 + a3 <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
        
        scanner.close();
    }
}