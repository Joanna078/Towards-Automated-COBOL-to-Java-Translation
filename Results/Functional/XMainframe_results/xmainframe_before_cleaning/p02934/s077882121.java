import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        int p1 = 1;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            int p2 = input.indexOf(' ', p1);
            a[i] = Integer.parseInt(input.substring(p1, p2));
            p1 = p2 + 1;
        }
        double wa = 0;
        for (int i = 0; i < n; i++) {
            wa += 1.0 / a[i];
        }
        double out = 1.0 / wa;
        String output = "";
        while (out > 0) {
            output = " " + out % 10;
            out /= 10;
        }
        System.out.println(output.trim().replaceAll("\\.?0*$", "").replaceFirst("^0", ""));
    }
}