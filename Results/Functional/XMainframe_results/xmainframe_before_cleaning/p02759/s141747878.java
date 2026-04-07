import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double ans = n / 2.0 + 0.9;
        System.out.println((int)ans);
    }
}