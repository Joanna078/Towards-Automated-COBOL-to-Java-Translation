import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        int K = Integer.parseInt(parts[0]);
        int X = Integer.parseInt(parts[1]);

        int st = X - K + 1;
        int ed = X + K - 1;

        for (int i = st; i <= ed; i++) {
            System.out.print(i + " ");
        }
    }
}