import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for A: ");
        int A = scanner.nextInt();

        System.out.print("Enter value for B: ");
        int B = scanner.nextInt();

        int C = 6 - A - B;

        System.out.println("C: " + C);

        scanner.close();
    }
}