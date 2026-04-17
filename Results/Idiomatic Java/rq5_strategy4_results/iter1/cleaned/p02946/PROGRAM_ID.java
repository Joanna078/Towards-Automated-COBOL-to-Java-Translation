import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values: ");
        String input = scanner.nextLine();

        String[] parts = input.split("\\s+");
        int K = Integer.parseInt(parts[0]);
        int X = Integer.parseInt(parts[1]);

        int st = X - K + 1;
        int ed = X + K - 1;

        if (K == 1) {
            System.out.print(st);
            return;
        }

        System.out.print(st);
        for (int i = st + 1; i <= ed; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}