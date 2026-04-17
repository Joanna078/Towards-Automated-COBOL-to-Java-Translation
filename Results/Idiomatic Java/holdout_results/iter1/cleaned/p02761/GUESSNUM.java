import java.util.Scanner;

public class GuessNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for INP1
        int N = scanner.nextInt();
        scanner.skip(" "); // Skip the filler character
        int M = scanner.nextInt();

        // Initialize table with spaces
        char[] tbl = new char[3];
        for (int i = 0; i < 3; i++) {
            tbl[i] = ' ';
        }

        boolean swErr = false;

        // Process each input for INP2
        for (int i = 0; i < M; i++) {
            int S = scanner.nextInt();
            scanner.skip(" "); // Skip the filler character
            char C = scanner.next().charAt(0);

            if (tbl[S - 1] == ' ') {
                if (C == '0' && S == 1 && N > 1) {
                    swErr = true;
                } else {
                    tbl[S - 1] = C;
                }
            } else {
                if (tbl[S - 1] != C) {
                    swErr = true;
                }
            }
        }

        if (swErr) {
            System.out.println("-1");
        } else {
            if (N > 1 && tbl[0] == ' ') {
                tbl[0] = '0';
            }

            for (int i = 0; i < N; i++) {
                if (tbl[i] == ' ') {
                    tbl[i] = '0';
                }
            }

            System.out.print(new String(tbl, 0, N));
        }

        scanner.close();
    }
}