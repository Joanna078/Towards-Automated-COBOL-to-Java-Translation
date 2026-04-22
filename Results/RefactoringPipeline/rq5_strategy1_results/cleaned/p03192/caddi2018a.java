import java.util.Scanner;

public class Caddi2018a {

    private int returnCode;
    private String n;
    private char c;

    public static void main(String[] args) {
        Caddi2018a program = new Caddi2018a();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextLine();

        if (n.length() > 4) {
            System.out.println("Error: Input exceeds 4 digits.");
            return;
        }

        c = '0';
        for (char digit : n.toCharArray()) {
            if (digit == '2') {
                c = '1';
                break;
            }
        }

        System.out.println("Result: " + c);
    }
}