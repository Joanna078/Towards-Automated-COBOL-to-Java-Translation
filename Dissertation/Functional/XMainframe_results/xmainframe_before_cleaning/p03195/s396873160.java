import java.util.Scanner;

public class Caddi2018D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a;
        boolean isFirstOdd = true;

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a % 2 != 0) {
                System.out.println("first");
                return;
            }
        }

        System.out.println("second");
    }
}