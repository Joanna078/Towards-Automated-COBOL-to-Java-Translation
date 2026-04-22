import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
        } else if (n == 2) {
            String a = scanner.next();
            String b = scanner.next();
            int sum = Integer.parseInt(a) + Integer.parseInt(b);
            if (sum > 9) {
                System.out.println(sum);
            } else {
                System.out.println(Integer.parseInt(String.valueOf(sum).charAt(0)));
            }
        } else {
            System.out.println("ERR!");
        }
    }
}
