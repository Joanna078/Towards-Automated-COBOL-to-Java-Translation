import java.util.Scanner;

public class Caddi2018d {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int e = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a: ");
            int a = scanner.nextInt();
            if (a % 2 != 0) {
                e = 1;
                break;
            }
        }

        if (e == 0) {
            System.out.println("second");
        } else {
            System.out.println("first");
        }

        scanner.close();
    }
}