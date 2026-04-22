import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine().trim();

        int WA = 0;
        int P1 = 0;
        int[] TW = new int[100];
        int I = 0;

        // Process input string
        while (I < N && P1 < INP.length()) {
            int P2 = P1;
            while (P2 < INP.length() && INP.charAt(P2) != ' ') {
                P2++;
            }
            int W = Integer.parseInt(INP.substring(P1, P2).trim());
            WA += W;
            TW[I] = WA;
            P1 = P2 + 1;
            I++;
        }

        double HF = WA / 2.0;
        int index = 0;

        // Find the first TW[i] >= HF
        while (index < N && TW[index] < HF) {
            index++;
        }

        if (index < N && TW[index] == HF) {
            System.out.println("0");
        } else {
            int S1 = WA - TW[index] * 2;
            int S2 = index > 0 ? WA - TW[index - 1] * 2 : WA - TW[index] * 2;
            int OUT = Math.min(S1, S2);
            System.out.println(OUT);
        }

        scanner.close();
    }
}