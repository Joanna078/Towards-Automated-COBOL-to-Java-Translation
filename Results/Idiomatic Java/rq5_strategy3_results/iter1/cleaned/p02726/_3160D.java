import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for N, X, Y separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        int N = Integer.parseInt(parts[0]);
        int X = Integer.parseInt(parts[1]);
        int Y = Integer.parseInt(parts[2]);
        
        int SA = Y - X;
        int CNT = 0;
        
        for (int I = 1; I < N; I++) {
            if (I == 1) {
                CNT = N;
            } else if (I == N - 1) {
                CNT = 0;
            } else {
                CNT = N - I;
            }
            
            int J = X - I + 1;
            int K = X + I - 1;
            if (J < 1) {
                J = 1;
            }
            if (K >= Y) {
                K = Y - 1;
            }
            
            int J1 = Y;
            int J2 = Y;
            
            for (int Jk = J; Jk <= K; Jk++) {
                for (int I1 = 0; I1 < I; I1++) {
                    if (Jk + I1 == X || Jk - I1 == X) {
                        J1 = Y;
                        J2 = Y;
                    } else if (Jk + I1 < X) {
                        J1++;
                    } else if (Jk - I1 > X) {
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
            }
        }
        
        System.out.printf("%04d%n", CNT);
    }
}