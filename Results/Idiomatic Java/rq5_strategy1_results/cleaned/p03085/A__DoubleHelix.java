import java.util.Scanner;

public class DoubleHelix {

    private boolean initialized = false;
    private int returnCode = 0;
    private char b_B = ' ';
    private byte[] b_ENKI = "ACGT".getBytes();
    private int b_I = 0;

    public static void main(String[] args) {
        DoubleHelix program = new DoubleHelix();
        program.execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        b_B = scanner.next().charAt(0);

        b_I = 1;
        while (b_I <= 4 && b_B != b_ENKI[b_I - 1]) {
            b_I++;
        }

        if (b_I <= 4) {
            System.out.println(new String(b_ENKI, b_I - 1, 1));
        } else {
            System.out.println("Character not found in ACGT");
        }

        System.exit(returnCode);
    }

    private void initialize() {
        initialized = true;
    }
}