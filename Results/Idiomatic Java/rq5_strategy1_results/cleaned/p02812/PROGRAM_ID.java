import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private String N = "";
    private String S = "";
    private String cnt = "";
    private String ans = "";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }
        acceptInput();
        inspectAndMove();
        displayResult();
    }

    private void initialize() {
        initialized = true;
    }

    private void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        N = scanner.nextLine();
        System.out.print("Enter a string (S): ");
        S = scanner.nextLine();
        scanner.close();
    }

    private void inspectAndMove() {
        cnt = S.replaceAll("[^ABC]", "");
        ans = cnt;
    }

    private void displayResult() {
        System.out.println("Count of 'ABC': " + ans);
    }
}