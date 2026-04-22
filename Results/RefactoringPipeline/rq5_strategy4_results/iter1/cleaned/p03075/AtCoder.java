import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        long A = scanner.nextLong();

        System.out.print("Enter B: ");
        long B = scanner.nextLong();

        System.out.print("Enter C: ");
        long C = scanner.nextLong();

        System.out.print("Enter D: ");
        long D = scanner.nextLong();

        System.out.print("Enter E: ");
        long E = scanner.nextLong();

        System.out.print("Enter F: ");
        long F = scanner.nextLong();

        if (E - A > F) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }

        scanner.close();
    }
}