import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter two numbers.");
            return;
        }
        
        try {
            int N = Integer.parseInt(parts[0]);
            int K = Integer.parseInt(parts[1]);
            
            int S = K / 2;
            int A = K % 2;
            double S1 = (double) N / K;
            int F1 = (int) S1;
            int S2 = (int) ((S1 - F1) * 10);
            
            long CNT = (long) Math.pow(F1, 3);
            if (A == 1) {
                if (S2 < 5) {
                    CNT += (long) Math.pow(F1, 3);
                } else {
                    CNT += (long) Math.pow(F1 + 1, 3);
                }
            }
            
            System.out.printf("%17d%n", CNT);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}