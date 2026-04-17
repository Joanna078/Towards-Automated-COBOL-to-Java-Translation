import java.util.Scanner;

public class Kyopuro {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inStr = "";
    private int n = 0;
    private int m = 0;
    private String viewRes = "";

    public static void main(String[] args) {
        Kyopuro kyopuro = new Kyopuro();
        kyopuro.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input string: ");
        inStr = scanner.nextLine();
        scanner.close();

        String[] parts = inStr.split("\\s+");
        if (parts.length >= 2) {
            try {
                n = Integer.parseInt(parts[0]);
                m = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter two integers separated by space.");
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter two integers separated by space.");
            return;
        }

        if (n == 10 && m == 10) {
            viewRes = "1";
        } else if (n == 10 || m == 10) {
            viewRes = String.valueOf(Math.max(n, m) - 2);
        } else {
            viewRes = String.valueOf((n - 2) * (m - 2));
        }

        System.out.println("Result: " + viewRes);
    }
}