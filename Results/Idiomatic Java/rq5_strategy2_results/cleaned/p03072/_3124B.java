import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        System.out.print("Enter INP: ");
        String INP = scanner.nextLine();

        int CNT = 0;
        int MAX = 0;
        int P1 = 0;

        for (int I = 1; I <= N; I++) {
            int P2 = P1;
            while (P2 < INP.length() && !INP.substring(P2, P2 + 1).equals(" ")) {
                P2++;
            }

            String H = INP.substring(P1, P2);
            int HValue = Integer.parseInt(H);

            if (HValue >= MAX) {
                CNT++;
            }
            if (HValue > MAX) {
                MAX = HValue;
            }

            P1 = P2 + 1;
        }

        System.out.println(CNT);
    }
}