import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        double h = l / 3.0;
        double out = Math.pow(h, 3);
        System.out.println(String.format("%.6f", out));
    }
}