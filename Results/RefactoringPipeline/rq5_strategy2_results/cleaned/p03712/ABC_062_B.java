import java.util.Scanner;

public class ABC_062_B {

    private static final char SHP = '#';
    private static final int MAX_LENGTH = 102;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        // Unstring input into H and W
        String[] parts = inp.split("\\s+");
        int H = Integer.parseInt(parts[0]);
        int W = Integer.parseInt(parts[1]);

        // Initialize ln
        StringBuilder ln = new StringBuilder();

        // First loop
        for (int i = 1; i <= W + 2; i++) {
            ln.append(SHP);
        }

        // Display ln
        System.out.println(ln.toString());

        // Second loop
        for (int i = 1; i <= H; i++) {
            // Accept a
            System.out.print("Enter a: ");
            String a = scanner.nextLine();

            // Initialize ln
            ln.setLength(0);
            ln.append(SHP);

            // Append a and SHP
            ln.append(a).append(SHP);

            // Display ln
            System.out.println(ln.toString());
        }

        // Reset ln
        ln.setLength(0);

        // Third loop
        for (int i = 1; i <= W + 2; i++) {
            ln.append(SHP);
        }

        // Display ln
        System.out.println(ln.toString());

        scanner.close();
    }
}