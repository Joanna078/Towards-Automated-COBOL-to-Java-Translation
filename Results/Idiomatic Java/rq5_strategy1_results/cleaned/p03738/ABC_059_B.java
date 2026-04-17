import java.util.Scanner;

public class ABC_059_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String A = "";
    private String B = "";
    private String strA = "";
    private String strB = "";

    public static void main(String[] args) {
        ABC_059_B program = new ABC_059_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter string A: ");
        A = scanner.nextLine();
        System.out.print("Enter string B: ");
        B = scanner.nextLine();

        // Calculate lengths
        int numA = 101 - A.length();
        int numB = 101 - B.length();

        // Perform operations
        for (int i = 1; i <= numA; i++) {
            strA += "0";
        }
        strA += A;

        for (int i = 1; i <= numB; i++) {
            strB += "0";
        }
        strB += B;

        // Compare strings
        if (strA.compareTo(strB) > 0) {
            System.out.println("GREATER");
        } else if (strA.compareTo(strB) < 0) {
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }

        scanner.close();
    }
}