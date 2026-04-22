import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        long A = Long.parseLong(parts[0]);
        long B = Long.parseLong(parts[1]);

        long ans = 0;
        long cur = 1;

        while (B > cur) {
            ans++;
            cur += A - 1;
        }

        System.out.println(String.format("%09d", ans));
    }
}