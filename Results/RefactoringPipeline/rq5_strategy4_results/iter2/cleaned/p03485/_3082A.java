import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());
        
        int wa = a + b;
        int x = wa / 2;
        
        if (wa % 2 != 0) {
            x += 1;
        }
        
        System.out.println(x);
    }
}