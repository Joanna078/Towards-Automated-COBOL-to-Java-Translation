import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        
        // Check if the number is zero
        if (x == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}