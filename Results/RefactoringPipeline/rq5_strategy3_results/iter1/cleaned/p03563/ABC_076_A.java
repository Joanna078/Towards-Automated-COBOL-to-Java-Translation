import java.util.Scanner;

public class ABC_076_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input values
        System.out.print("Enter R: ");
        int R = scanner.nextInt();
        System.out.print("Enter G: ");
        int G = scanner.nextInt();

        // Perform operations as per COBOL logic
        R = G - R;
        R += G;
        int ZS = R;

        // Convert ZS to string and remove leading spaces
        String ans = Integer.toString(ZS).trim();

        // Display the result
        System.out.println(ans);

        scanner.close();
    }
}