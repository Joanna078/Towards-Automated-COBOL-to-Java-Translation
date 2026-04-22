import java.util.Scanner;

public class ABC_073_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        int sm = 0;

        for (int i = 1; i <= N; i++) {
            // Accept INP
            String INP = scanner.nextLine();

            // Split INP into l and r
            String[] parts = INP.split("\\s+");
            int l = Integer.parseInt(parts[0]);
            int r = Integer.parseInt(parts[1]);

            // Perform operations
            r -= l;
            r += 1;
            sm += r;
        }

        // Convert sm to ZS format
        String ZS = String.format("%07d", sm);

        // Extract ans from ZS
        String ans = ZS.substring(1);

        // Display ans
        System.out.println(ans);
    }
}