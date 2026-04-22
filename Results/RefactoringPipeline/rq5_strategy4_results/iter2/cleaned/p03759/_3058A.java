import java.util.Scanner;

public class Program058A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Invalid input. Please enter exactly three numbers.");
            return;
        }
        
        try {
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            int C = Integer.parseInt(parts[2]);
            
            int ans1 = B - A;
            int ans2 = C - B;
            
            if (ans1 == ans2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}