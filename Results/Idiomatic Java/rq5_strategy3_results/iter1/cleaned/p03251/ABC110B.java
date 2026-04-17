import java.util.Scanner;

public class ABC110B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first line
        String[] parts = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);
        int X = Integer.parseInt(parts[2]);
        int Y = Integer.parseInt(parts[3]);

        // Read the second line and find the maximum value
        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(scanner.next());
            if (X < T) {
                X = T;
            }
        }

        // Read the third line and find the minimum value
        for (int i = 0; i < M; i++) {
            int T = Integer.parseInt(scanner.next());
            if (T < Y) {
                Y = T;
            }
        }

        // Determine the result
        if (X < Y) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }

        scanner.close();
    }
}