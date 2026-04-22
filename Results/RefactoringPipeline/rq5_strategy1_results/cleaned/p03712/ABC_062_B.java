import java.util.Scanner;

public class ABC_062_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "       ";
    private String h = "000";
    private String w = "000";
    private String ln = " ".repeat(102);
    private String a = " ".repeat(100);

    public static void main(String[] args) {
        ABC_062_B program = new ABC_062_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        // Unstring input
        String[] parts = inp.split("\\s+");
        if (parts.length >= 2) {
            h = parts[0];
            w = parts[1];
        }

        // Perform loop
        for (int i = 1; i <= Integer.parseInt(w) + 2; i++) {
            ln = "SHP" + ln;
            System.out.println(ln);
        }

        // Perform loop
        for (int i = 1; i <= Integer.parseInt(h); i++) {
            System.out.print("Enter string: ");
            a = scanner.nextLine().trim();
            ln = "SHP" + a;
            System.out.println(ln);
        }

        // Perform loop
        for (int i = 1; i <= Integer.parseInt(w) + 2; i++) {
            ln = "SHP" + ln;
            System.out.println(ln);
        }

        scanner.close();
    }
}