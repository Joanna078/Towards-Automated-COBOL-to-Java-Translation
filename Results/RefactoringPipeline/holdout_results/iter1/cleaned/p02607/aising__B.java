import java.util.Scanner;

public class AisingB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine();

        int CNT = 0;
        int P1 = 0;
        int SW_K = 1;

        for (int I = 1; I <= N; I++) {
            int P2 = P1;
            while (P2 < INP.length() && INP.charAt(P2) != ' ') {
                P2++;
            }
            String A = INP.substring(P1, P2);
            int S = Integer.parseInt(A) / 2;
            int AMR = Integer.parseInt(A) % 2;

            if (SW_K == 1 && AMR == 1) {
                CNT++;
            }

            P1 = P2 + 1;
            SW_K = 1 - SW_K;
        }

        System.out.println(CNT);
    }
}