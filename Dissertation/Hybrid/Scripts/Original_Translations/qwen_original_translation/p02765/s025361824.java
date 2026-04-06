import java.util.Scanner;

public class Test156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables
        int rate = 0;
        int a = 0;
        int b = 0;
        int naibu = 0;
        int x = 0;
        int y = 0;
        
        // Accept input
        System.out.print("Enter value for A: ");
        a = scanner.nextInt();
        System.out.print("Enter value for RATE: ");
        rate = scanner.nextInt();
        
        if (a >= 10) {
            System.out.println(rate);
        } else {
            b = a;
            y = 10 - b;
            x = 100 * y;
            naibu = rate + x;
            System.out.println(naibu);
        }
        
        scanner.close();
    }
}