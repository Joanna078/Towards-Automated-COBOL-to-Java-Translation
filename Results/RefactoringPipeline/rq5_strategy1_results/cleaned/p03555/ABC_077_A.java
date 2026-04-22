import java.util.Scanner;

public class ABC_077_A {

    private int returnCode;
    private String c1;
    private String c2;

    public static void main(String[] args) {
        ABC_077_A program = new ABC_077_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT C1
        System.out.print("Enter C1: ");
        c1 = scanner.nextLine().trim();

        // ACCEPT C2
        System.out.print("Enter C2: ");
        c2 = scanner.nextLine().trim();

        // IF C1 = C2
        if (c1.equals(c2)) {
            // DISPLAY "YES"
            System.out.println("YES");
        } else {
            // DISPLAY "NO"
            System.out.println("NO");
        }

        // STOP RUN
        returnCode = 0;
        System.exit(returnCode);
    }
}