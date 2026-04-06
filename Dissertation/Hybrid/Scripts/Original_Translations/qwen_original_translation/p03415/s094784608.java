import java.util.Scanner;

public class ADiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input characters
        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);
        char c3 = scanner.next().charAt(0);

        // Display the diagonal characters
        System.out.println(c1 + "" + c2 + "" + c3);

        scanner.close();
    }
}