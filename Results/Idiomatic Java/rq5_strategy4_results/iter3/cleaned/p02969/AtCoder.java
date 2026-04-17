import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        scanner.close();

        A = 3 * A * A;
        System.out.println(A);
    }
}