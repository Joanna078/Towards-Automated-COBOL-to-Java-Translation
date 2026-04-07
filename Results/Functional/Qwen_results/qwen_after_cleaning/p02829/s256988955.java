import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        int A = Integer.parseInt(scanner.nextLine());
        int B = Integer.parseInt(scanner.nextLine());

        // Compute result
        int C = 6 - A - B;

        // Output result
        System.out.println(C);
    }
}