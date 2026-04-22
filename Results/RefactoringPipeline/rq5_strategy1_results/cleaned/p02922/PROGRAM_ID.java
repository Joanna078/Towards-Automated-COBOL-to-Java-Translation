import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private String ln = "";
    private int A = 0;
    private int B = 0;
    private int ans = 0;
    private int cur = 1;

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values separated by space: ");
        ln = scanner.nextLine();
        String[] parts = ln.split("\\s+");
        if (parts.length == 2) {
            try {
                A = Integer.parseInt(parts[0]);
                B = Integer.parseInt(parts[1]);
                process();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
            }
        } else {
            System.out.println("Please enter exactly two values.");
        }
        scanner.close();
    }

    private void process() {
        while (cur <= B) {
            ans++;
            cur += A;
        }
        System.out.println("Result: " + ans);
    }
}