import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values separated by space (A B N): ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        long A = Long.parseLong(parts[0]);
        long B = Long.parseLong(parts[1]);
        long N = Long.parseLong(parts[2]);
        
        long X = Math.min(N, B - 1);
        long FA = (A * X) / B;
        long FB = A * (X / B);
        long OUT = FA - FB;
        
        System.out.println(String.format("%17d", OUT).trim());
    }
}