import java.util.Scanner;

public class ABC_092_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Calculate X and Y
        int X = Math.min(A, B);
        int Y = Math.min(C, D);

        // Add X and Y
        int ZS = X + Y;

        // Convert ZS to string and split into dummy and answer
        String zsStr = String.format("%05d", ZS);
        String ans = zsStr.substring(1); // Remove the leading zero

        // Display the answer
        System.out.println(ans);

        scanner.close();
    }
}