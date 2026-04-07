import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = n;
        int harshad = 0;

        while (d != 0) {
            int r = d % 10;
            d /= 10;
            harshad += r;
        }

        if (harshad == 0 || n % harshad != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}