import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private String ln = "";
    private String s = "";
    private String t = "";
    private String u = "";
    private int a = 0;
    private int b = 0;
    private String zs = "";
    private char dummy = ' ';
    private String ans = "";
    private String z = "";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept first line
        System.out.print("Enter first line: ");
        ln = scanner.nextLine();
        String[] parts = ln.split("\\s+");
        s = parts[0];
        t = parts[1];

        // Accept second line
        System.out.print("Enter second line: ");
        ln = scanner.nextLine();
        parts = ln.split("\\s+");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);

        // Accept third line
        System.out.print("Enter third line: ");
        u = scanner.nextLine();

        // Perform logic
        if (s.equals(u)) {
            a += 1;
        } else {
            b += 1;
        }

        zs = String.valueOf(a);
        unans();
        z = ans + " ";

        zs = String.valueOf(b);
        unans();
        z += ans;

        System.out.println(z);
    }

    private void unans() {
        String[] parts = zs.split("\\s+");
        ans = parts[parts.length - 1];
    }
}