import java.util.Scanner;

public class ABC110B {

    private boolean initialized = false;
    private int returnCode = 0;
    private int N = 0;
    private int M = 0;
    private int X = 0;
    private int Y = 0;
    private int T = 0;
    private String L = "";
    private int PTR = 0;

    public static void main(String[] args) {
        new ABC110B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        if (!initialized) {
            initialize();
        }

        // Accept input
        System.out.print("Enter input: ");
        L = scanner.nextLine();

        // Unstring and process
        String[] parts = L.split("\\s+");
        N = Integer.parseInt(parts[0]);
        M = Integer.parseInt(parts[1]);
        X = Integer.parseInt(parts[2]);
        Y = Integer.parseInt(parts[3]);

        // Process N times
        for (int i = 0; i < N; i++) {
            System.out.print("Enter input: ");
            L = scanner.nextLine();
            parts = L.split("\\s+");
            T = Integer.parseInt(parts[PTR - 1]);
            if (X < T) {
                X = T;
            }
        }

        // Process M times
        for (int i = 0; i < M; i++) {
            System.out.print("Enter input: ");
            L = scanner.nextLine();
            parts = L.split("\\s+");
            T = Integer.parseInt(parts[PTR - 1]);
            if (Y < T) {
                Y = T;
            }
        }

        // Display result
        if (X < Y) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }

        scanner.close();
    }

    private void initialize() {
        initialized = true;
        returnCode = 0;
        N = 0;
        M = 0;
        X = 0;
        Y = 0;
        T = 0;
        L = "";
        PTR = 1;
    }
}