import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        scanner.close();

        String[] parts = ln.split("\\s+");
        long A = Long.parseLong(parts[0]);
        long B = Long.parseLong(parts[1]);
        long C = Long.parseLong(parts[2]);

        if (A < B + C) {
            long ans = B + C - A;
            System.out.printf("%9d%n", ans);
        } else {
            System.out.println("0");
        }
    }
}