import java.util.Scanner;

public class ABC_062_B {

    private static final char SHP = '#';
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int H = Integer.parseInt(parts[0]);
        int W = Integer.parseInt(parts[1]);

        StringBuilder ln = new StringBuilder();

        // First loop
        for (int i = 1; i <= W + 2; i++) {
            ln.append(SHP);
        }
        System.out.println(ln.toString());

        // Second loop
        for (int i = 1; i <= H; i++) {
            String a = scanner.nextLine();
            ln.setLength(0); // Clear ln
            ln.append(SHP);
            ln.append(a);
            ln.append(SHP);
            System.out.println(ln.toString());
        }

        // Third loop
        ln.setLength(0); // Clear ln
        for (int i = 1; i <= W + 2; i++) {
            ln.append(SHP);
        }
        System.out.println(ln.toString());
    }
}