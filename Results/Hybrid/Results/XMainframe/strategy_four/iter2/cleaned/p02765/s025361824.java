import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int rate = scanner.nextInt();
        if (a >= 10) {
            System.out.println(rate);
        } else {
            int b = a;
            int y = 10 - b;
            int x = 100 * y;
            int naibu = rate + x;
            System.out.println(naibu);
        }
    }
}