import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        if (parts.length != 2) {
            System.out.println("-1");
            return;
        }
        
        try {
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            
            int P1 = (int) Math.round(A * 12.5);
            int P2 = B * 10;
            int PRI = Math.max(P1, P2);
            
            double T1 = PRI * 0.08;
            double T2 = PRI * 0.1;
            
            if (T1 != A || T2 != B) {
                System.out.println("-1");
            } else {
                System.out.println(PRI);
            }
        } catch (NumberFormatException e) {
            System.out.println("-1");
        }
    }
}