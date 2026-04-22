import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        String[] parts = input.split(" ");
        int A = Integer.parseInt(parts[0].trim());
        int B = Integer.parseInt(parts[1].trim());
        
        int WA = A + B;
        int X = WA / 2;
        int AMA = WA % 2;
        
        if (AMA != 0) {
            X += 1;
        }
        
        System.out.printf("%03d%n", X);
    }
}