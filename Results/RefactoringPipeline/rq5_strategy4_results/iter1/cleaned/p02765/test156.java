import java.util.Scanner;

public class Test156 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input values
        System.out.print("Enter A: ");
        int A = scanner.nextInt();

        System.out.print("Enter RATE: ");
        int RATE = scanner.nextInt();

        // Initialize variables
        int B = 0;
        int X = 0;
        int Y = 0;
        int NAIBU = 0;

        // Main logic
        if (A >= 10) {
            System.out.println(RATE);
        } else {
            B = A;
            Y = 10 - B;
            X = 100 * Y;
            NAIBU = RATE + X;
            System.out.println(NAIBU);
        }

        scanner.close();
    }
}