import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        int N = Integer.parseInt(parts[0]);
        int X = Integer.parseInt(parts[1]);
        int Y = Integer.parseInt(parts[2]);

        for (int I = 1; I <= N; I++) {
            int CNT = 0;
            if (I == 1) {
                CNT = N;
            } else if (I == N - 1) {
                CNT = 0;
            } else {
                CNT = N - I;
            }

            int J = Math.max(1, X - I + 1);
            int K = Math.min(Y - 1, X + I - 1);

            int J1 = Y;
            int J2 = Y;

            for (int I1 = 0; I1 < I; I1++) {
                int sum = J + I1;
                int diff = J - I1;

                if (sum == X || diff == X) {
                    J1 = Y;
                    J2 = Y;
                } else if (sum < X) {
                    J1++;
                } else if (diff > X) {
                    J2--;
                }
            }

            if (J1 == J2) {
                if (J + I < J1) {
                    CNT++;
                }
            } else {
                if (J + I < J1 && J + I <= Y && J1 <= N) {
                    CNT++;
                } else if (J + I < J1 && J + I > Y && J + I <= N && J1 > N) {
                    CNT--;
                }

                if (J + I < J2) {
                    CNT++;
                } else if (J + I > J2 && J + I <= Y) {
                    CNT--;
                }
            }

            System.out.printf("%04d%n", CNT);
        }
    }
}