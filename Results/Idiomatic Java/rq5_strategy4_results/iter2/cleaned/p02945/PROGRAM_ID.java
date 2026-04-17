import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String ln = scanner.nextLine();
        
        String[] parts = ln.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        
        int ans = Math.max(Math.max(A + B, A - B), A * B);
        System.out.printf("%010d%n", ans);
    }
}