import java.util.Scanner;

public class ABC110B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first line
        String[] input1 = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(input1[0]);
        int M = Integer.parseInt(input1[1]);
        int X = Integer.parseInt(input1[2]);
        int Y = Integer.parseInt(input1[3]);

        // Read the second line
        String[] input2 = scanner.nextLine().split("\\s+");
        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(input2[i]);
            if (X < T) {
                X = T;
            }
        }

        // Read the third line
        String[] input3 = scanner.nextLine().split("\\s+");
        for (int i = 0; i < M; i++) {
            int T = Integer.parseInt(input3[i]);
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