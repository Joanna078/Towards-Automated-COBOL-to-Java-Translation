import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n == 1) {
            System.out.println("Hello World");
        } else if (n == 2) {
            System.out.print("Enter first character: ");
            char a = scanner.next().charAt(0);
            
            System.out.print("Enter second character: ");
            char b = scanner.next().charAt(0);
            
            int a9 = Character.getNumericValue(a);
            int b9 = Character.getNumericValue(b);
            
            int c9 = a9 + b9;
            
            if (c9 > 9) {
                System.out.println(c9);
            } else {
                System.out.println(c9);
            }
        } else {
            System.out.println("ERR!");
        }
        
        scanner.close();
    }
}