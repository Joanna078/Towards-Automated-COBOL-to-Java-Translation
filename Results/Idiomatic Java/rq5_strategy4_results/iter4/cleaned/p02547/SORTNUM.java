import java.util.Scanner;

public class SortNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        int count = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            char d1 = input.charAt(0);
            char d2 = input.charAt(1);

            if (d1 == d2) {
                count++;
                if (count == 3) {
                    System.out.println("Yes");
                    return;
                }
            } else {
                count = 0;
            }
        }

        if (count != 3) {
            System.out.println("No");
        }

        scanner.close();
    }
}