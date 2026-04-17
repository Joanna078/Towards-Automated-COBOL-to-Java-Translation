import java.util.Scanner;

public class ABC_049_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        // Split input into H and W
        String[] parts = inp.split("\\s+");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);

        // Perform loop
        for (int i = 1; i <= h; i++) {
            // Accept string C
            System.out.print("Enter string C: ");
            String c = scanner.nextLine();

            // Display string C twice
            System.out.println(c);
            System.out.println(c);
        }

        scanner.close();
    }
}