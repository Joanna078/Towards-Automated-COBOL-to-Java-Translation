import java.util.Scanner;

public class ABC_049_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "       ";
    private int h = 0;
    private int w = 0;
    private String c = "";
    private int i = 0;

    public static void main(String[] args) {
        new ABC_049_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        // UNSTRING
        String[] parts = inp.split("\\s+");
        if (parts.length > 0) {
            h = Integer.parseInt(parts[0]);
        }
        if (parts.length > 1) {
            w = Integer.parseInt(parts[1]);
        }

        // PERFORM
        i = 1;
        while (i <= h) {
            // ACCEPT
            System.out.print("Enter string: ");
            c = scanner.nextLine().trim();

            // DISPLAY
            System.out.println(c);
            System.out.println(c);

            i++;
        }

        // STOP
        System.exit(returnCode);
    }
}