import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String input = scanner.nextLine().trim();
        int p1 = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            int p2 = input.indexOf(' ', p1);
            if (p2 == -1) {
                p2 = input.length();
            }
            a[i] = Integer.parseInt(input.substring(p1, p2).trim());
            p1 = p2 + 1;
        }
        double wa = 0;
        for (int i = 0; i < n; i++) {
            wa += 1.0 / a[i];
        }
        double out = 1.0 / wa;
        String output = String.format("%.10f", out);
        output = output.replaceFirst("^0\\.", "");
        output = output.replaceAll("0+$", "");
        if (output.length() > 4 && output.charAt(4) == '.') {
            output = output.substring(0, 4) + " " + output.substring(4);
        }
        System.out.println(output);
    }
}