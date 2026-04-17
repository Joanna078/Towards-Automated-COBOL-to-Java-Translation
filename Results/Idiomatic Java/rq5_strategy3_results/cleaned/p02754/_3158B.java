import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] parts = input.split("\\s+");
        long N = Long.parseLong(parts[0]);
        long A = Long.parseLong(parts[1]);
        long B = Long.parseLong(parts[2]);

        long cnt = N / (A + B);
        long sumA = 0;
        long sumB = 0;
        long outCnt = 0;

        if (A == 0) {
            outCnt = 0;
        } else if (B == 0) {
            outCnt = N;
        } else {
            sumA = A * cnt;
            sumB = B * cnt;

            while (N > sumA + sumB) {
                sumA += A;
                sumB += B;
            }

            long bkCnt = sumA + sumB - N;
            if (bkCnt <= B) {
                outCnt = sumA;
            } else {
                outCnt = sumA - (bkCnt - B);
            }
        }

        System.out.println(outCnt);
    }
}