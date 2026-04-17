import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private String ln = "   ";
    private String n = "000";
    private String m = "000";
    private String ans = "   ";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        ln = scanner.nextLine().trim();

        if (ln.length() > 3) {
            ln = ln.substring(0, 3);
        }

        String[] parts = ln.split("\\s+");
        if (parts.length >= 2) {
            n = parts[0];
            m = parts[1];
        }

        if (n.equals(m)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}