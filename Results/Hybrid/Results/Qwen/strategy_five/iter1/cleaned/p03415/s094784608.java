import java.util.Scanner;

public class ADiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        String c1 = scanner.next();
        String c2 = scanner.next();
        String c3 = scanner.next();

        // Display the diagonal characters
        System.out.println(c1.charAt(0) + "" + c2.charAt(1) + "" + c3.charAt(2));

        scanner.close();
    }
}