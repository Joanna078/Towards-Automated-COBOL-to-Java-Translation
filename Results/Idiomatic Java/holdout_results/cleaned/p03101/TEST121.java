import java.util.Scanner;

public class TEST121 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read first line
            String[] parts1 = scanner.nextLine().split("\\s+");
            int H1 = Integer.parseInt(parts1[0]);
            int W1 = Integer.parseInt(parts1[1]);

            // Read second line
            String[] parts2 = scanner.nextLine().split("\\s+");
            int H2 = Integer.parseInt(parts2[0]);
            int W2 = Integer.parseInt(parts2[1]);

            // Calculate (H1 - H2) * (H1 - H2)
            int WK = (H1 - H2) * (H1 - H2);

            // Display the result
            System.out.printf("%d%n", WK);
        }
    }
}