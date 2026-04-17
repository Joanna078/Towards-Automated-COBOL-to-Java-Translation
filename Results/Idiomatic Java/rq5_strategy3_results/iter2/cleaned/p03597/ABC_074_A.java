import java.util.Scanner;

public class ABC_074_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input values
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        System.out.print("Enter A: ");
        int A = scanner.nextInt();

        // Compute N^2 - A
        int result = (int) Math.pow(N, 2) - A;

        // Convert result to string and remove leading spaces
        String resultStr = String.valueOf(result).replaceAll("^0+(?!$)", "");

        // Display the result
        System.out.println(resultStr);

        scanner.close();
    }
}