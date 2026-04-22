import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input K
        System.out.print("Enter K: ");
        int k = scanner.nextInt();

        // Input INP
        System.out.print("Enter INP: ");
        String inp = scanner.nextLine().trim(); // Use nextLine() to read the full line

        // Split INP into A and B
        String[] parts = inp.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid input format");
            return;
        }
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        // Calculate S1, S2, A1, A2
        int s1 = a / k;
        int a1 = a % k;
        int s2 = b / k;
        int a2 = b % k;

        // Check conditions
        if ((s1 >= 1 && s2 > 1) || (a1 == 0 && a > k)) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        scanner.close();
    }
}