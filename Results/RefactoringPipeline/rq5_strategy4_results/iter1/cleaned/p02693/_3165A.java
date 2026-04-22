import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept K
        int K = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine().trim();

        // Unstring INP delimited by space into A and B
        String[] parts = INP.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);

        // Divide A by K giving S1 remainder A1
        int S1 = A / K;
        int A1 = A % K;

        // Divide B by K giving S2 remainder A2
        int S2 = B / K;
        int A2 = B % K;

        // Check conditions
        if (((S1 >= 1) && (S2 > 1)) || ((A1 == 0) && (A > K))) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        scanner.close();
    }
}