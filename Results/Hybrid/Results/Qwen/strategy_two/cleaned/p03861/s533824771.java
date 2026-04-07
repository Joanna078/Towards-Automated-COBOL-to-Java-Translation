import java.util.Scanner;

public class ABC_048_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly three space-separated values.");
        }

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int x = Integer.parseInt(parts[2]);

        int q1 = a / x;
        int r = a % x;
        int q2 = b / x;

        if (r != 0) {
            q2++;
        }

        System.out.println(q2);
    }
}