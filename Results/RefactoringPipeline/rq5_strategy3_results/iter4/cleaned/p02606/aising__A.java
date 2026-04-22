import java.util.Scanner;

public class AisingA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        int L = Integer.parseInt(parts[0]);
        int R = Integer.parseInt(parts[1]);
        int D = Integer.parseInt(parts[2]);

        int count = calculateCount(L, R, D);
        System.out.println(count);
    }

    private static int calculateCount(int L, int R, int D) {
        if (D == 1) {
            return R - L + 1;
        } else {
            int count = 0;
            for (int i = 1; D * i <= R; i++) {
                if (D * i >= L) {
                    count++;
                }
            }
            return count;
        }
    }
}