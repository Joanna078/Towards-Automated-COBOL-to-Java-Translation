import java.util.Scanner;

public class Main {

    private int returnCode;
    private String inp;
    private int x;
    private int y;
    private int i;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        if (inp.length() != 10) {
            System.out.println("Invalid input length.");
            return;
        }

        unstring(inp);
        performLoop();
        displayResult();
    }

    private void unstring(String inp) {
        x = Integer.parseInt(inp.substring(0, 3));
        y = Integer.parseInt(inp.substring(3, 6));
    }

    private void performLoop() {
        i = 1;
        while (true) {
            if (i > x || calculateCondition(i)) {
                break;
            }
            i++;
        }
    }

    private boolean calculateCondition(int i) {
        int condition1 = (i * 2) - x;
        int condition2 = (i * 4) - x;
        return condition1 == y || condition2 == y;
    }

    private void displayResult() {
        if (i <= x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}