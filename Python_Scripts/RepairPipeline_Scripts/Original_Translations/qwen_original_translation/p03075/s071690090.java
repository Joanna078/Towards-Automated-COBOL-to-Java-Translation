import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        int A = Integer.parseInt(scanner.nextLine());
        int B = Integer.parseInt(scanner.nextLine());
        int C = Integer.parseInt(scanner.nextLine());
        int D = Integer.parseInt(scanner.nextLine());
        int E = Integer.parseInt(scanner.nextLine());
        int F = Integer.parseInt(scanner.nextLine());

        // Logic
        if (E - A > F) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }

        scanner.close();
    }
}