import java.util.Scanner;

public class ABC_068_A {

    private int returnCode = 0;
    private String n = "   ";
    private String ans = "                  ";

    public static void main(String[] args) {
        ABC_068_A program = new ABC_068_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for N: ");
        n = scanner.nextLine().substring(0, Math.min(n.length(), scanner.nextLine().length()));
        scanner.close();

        System.out.println("ABC" + n);
        System.exit(returnCode);
    }
}