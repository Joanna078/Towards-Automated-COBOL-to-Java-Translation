import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        // Splitting input into two parts
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Logic
        int out;
        if (a == b) {
            out = a * 2;
        } else if (a > b) {
            out = a * 2 - 1;
        } else {
            out = b * 2 - 1;
        }
        
        // Output
        System.out.print(out);
        
        scanner.close();
    }
}