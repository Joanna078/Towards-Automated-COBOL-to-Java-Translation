import java.util.Scanner;

public class ABC_084_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String m = "00";

    public static void main(String[] args) {
        ABC_084_A program = new ABC_084_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        m = scanner.nextLine().substring(0, 2);
        scanner.close();

        int num = Integer.parseInt(m);
        int result = 48 - num;
        System.out.println("Result: " + result);
    }
}