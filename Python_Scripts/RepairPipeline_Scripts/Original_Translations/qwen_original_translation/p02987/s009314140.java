import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        String input = scanner.nextLine();
        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);
        
        // Check conditions
        if ((a == b) || (c == d)) {
            System.out.println("YES");
        } else if ((a == c) || (b == d)) {
            System.out.println("YES");
        } else if ((a == d) || (b == c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}