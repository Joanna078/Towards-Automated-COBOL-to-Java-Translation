import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private short a = 0;
    private short b = 0;
    private short c = 0;
    private int x = 0;
    private int y = 0;
    private int sa = 0;
    private short big = 0;
    private int max = 0;
    private int cnt = 0;
    private int out = 0;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        unstringInput();
        computeMax();
        determineBig();
        computeCnt();
        displayResult();
    }

    private void unstringInput() {
        String[] parts = inp.split(" ");
        a = Short.parseShort(parts[0]);
        b = Short.parseShort(parts[1]);
        c = Short.parseShort(parts[2]);
        x = Integer.parseInt(parts[3]);
        y = Integer.parseInt(parts[4]);
    }

    private void computeMax() {
        max = (a * x) + (b * y);
    }

    private void determineBig() {
        if (x >= y) {
            big = a;
            sa = x - y;
        } else {
            big = b;
            sa = y - x;
        }
    }

    private void computeCnt() {
        if (big <= (c * 2)) {
            cnt = max;
        } else {
            cnt = max - ((big - (c * 2)) * sa);
        }
    }

    private void displayResult() {
        System.out.println("Output: " + cnt);
    }
}