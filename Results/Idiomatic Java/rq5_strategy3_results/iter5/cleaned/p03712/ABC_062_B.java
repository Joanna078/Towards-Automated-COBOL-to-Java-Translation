import java.util.Scanner;

public class ABC_062_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        // Unstring input into H and W
        String[] parts = inp.split("\\s+");
        int H = Integer.parseInt(parts[0]);
        int W = Integer.parseInt(parts[1]);

        StringBuilder ln = new StringBuilder();

        // First loop
        for (int i = 0; i < W + 2; i++) {
            ln.append("#");
        }

        // Display result
        System.out.println(ln.toString());

        // Second loop
        for (int i = 0; i < H; i++) {
            System.out.print("Enter value: ");
            String a = scanner.nextLine();

            // Initialize ln with SHP
            ln.setLength(0);
            ln.append("#").append(a).append("#");

            // Display result
            System.out.println(ln.toString());
        }

        // Third loop
        ln.setLength(0);
        for (int i = 0; i < W + 2; i++) {
            ln.append("#");
        }

        // Display result
        System.out.println(ln.toString());

        scanner.close();
    }
}