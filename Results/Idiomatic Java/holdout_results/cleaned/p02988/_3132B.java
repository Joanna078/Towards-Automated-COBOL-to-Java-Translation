import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine().trim();

        int[] P = new int[20];
        int P1 = 0;
        int P2 = 0;

        // Split input string into parts
        for (int i = 0; i < N && P1 < INP.length(); i++) {
            P2 = INP.indexOf(' ', P1);
            if (P2 == -1) {
                P2 = INP.length();
            }
            P[i] = Integer.parseInt(INP.substring(P1, P2).trim());
            P1 = P2 + 1;
        }

        int K = 0;

        // Count peaks and valleys
        for (int i = 1; i < N - 1; i++) {
            if ((P[i - 1] < P[i] && P[i] < P[i + 1]) ||
                (P[i - 1] > P[i] && P[i] > P[i + 1])) {
                K++;
            }
        }

        // Output the result
        System.out.println(K);
    }
}