import java.util.Scanner;

public class Main {

    private int returnCode;
    private String inp;
    private int a;
    private int b;
    private int out;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        if (inp.length() != 4 || !Character.isDigit(inp.charAt(0)) || !Character.isDigit(inp.charAt(1)) ||
            !Character.isDigit(inp.charAt(2)) || !Character.isDigit(inp.charAt(3))) {
            System.out.println("Invalid input. Please enter exactly four digits.");
            return;
        }

        a = Character.getNumericValue(inp.charAt(0));
        b = Character.getNumericValue(inp.charAt(1));

        if (a == b) {
            out = a * 2;
        } else if (a > b) {
            out = (a * 2) - 1;
        } else {
            out = (b * 2) - 1;
        }

        System.out.println("Output: " + out);
    }
}