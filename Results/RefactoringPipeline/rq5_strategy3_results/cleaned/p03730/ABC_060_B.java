import java.util.Scanner;

public class ABC_060_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);

        int num = A;
        boolean found = false;

        for (int i = 1; A * B >= num; i++) {
            if (num % B == C) {
                found = true;
                break;
            }
            num = i * A;
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}