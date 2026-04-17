import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number (1 or 2): ");
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("Hello World");
        } else if (n == 2) {
            System.out.print("Enter value for A: ");
            char a = scanner.next().charAt(0);
            System.out.print("Enter value for B: ");
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
    }
}