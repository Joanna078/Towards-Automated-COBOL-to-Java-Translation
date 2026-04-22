import java.util.Scanner;

public class Test156 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Accept input values
            System.out.print("Enter A: ");
            int A = scanner.nextInt();

            System.out.print("Enter RATE: ");
            int RATE = scanner.nextInt();

            // Main logic
            if (A >= 10) {
                System.out.println(RATE);
            } else {
                int B = A;
                int Y = 10 - B;
                int X = 100 * Y;
                int NAIBU = RATE + X;
                System.out.println(NAIBU);
            }
        }
    }
}