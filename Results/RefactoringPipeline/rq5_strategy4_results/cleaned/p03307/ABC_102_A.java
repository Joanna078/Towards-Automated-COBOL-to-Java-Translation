import java.util.Scanner;

public class ABC_102_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 != 0) {
            n *= 2;
        }

        System.out.println(n);
    }
}