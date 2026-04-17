import java.util.Scanner;

public class ABC_061_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for INP
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        int[] town = new int[N + 1]; // Array to store counts, 1-based index

        // Process each line of input
        for (int i = 0; i < M; i++) {
            String inp2 = scanner.nextLine();
            String[] parts2 = inp2.split("\\s+");
            int a = Integer.parseInt(parts2[0]);
            int b = Integer.parseInt(parts2[1]);
            town[a]++;
            town[b]++;
        }

        // Display results
        for (int i = 1; i <= N; i++) {
            System.out.print(town[i] + (i == N ? "" : " "));
        }
    }
}