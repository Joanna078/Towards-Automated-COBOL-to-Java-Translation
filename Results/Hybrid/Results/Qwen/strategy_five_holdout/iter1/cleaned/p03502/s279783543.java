import java.util.Scanner;

public class ABC_080_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        int n = scanner.nextInt();

        // Initialize variables
        int d = n;
        int harshad = 0;

        // Calculate sum of digits
        while (d != 0) {
            int r = d % 10;
            harshad += r;
            d /= 10;
        }

        // Check if number is Harshad number
        if (n % harshad == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}