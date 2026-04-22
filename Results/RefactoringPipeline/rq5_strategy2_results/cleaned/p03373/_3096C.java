import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values: ");
        String input = scanner.nextLine();
        
        String[] parts = input.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);
        int X = Integer.parseInt(parts[3]);
        int Y = Integer.parseInt(parts[4]);

        long MAX = (long) A * X + (long) B * Y;
        int BIG;
        int SA;

        if (X >= Y) {
            BIG = A;
            SA = X - Y;
        } else {
            BIG = B;
            SA = Y - X;
        }

        long CNT;
        if (A + B <= C * 2) {
            CNT = MAX;
        } else {
            CNT = MAX - (A + B - C * 2) * Math.min(X, Y);
            if (BIG > C * 2) {
                CNT -= (BIG - C * 2) * SA;
            }
        }

        System.out.printf("%08d%n", CNT);
    }
}