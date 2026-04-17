import java.util.Scanner;

public class Main {

    private int returnCode;
    private String k;
    private String s;
    private int len;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT K
        System.out.print("Enter K: ");
        k = scanner.nextLine().trim();

        // ACCEPT S
        System.out.print("Enter S: ");
        s = scanner.nextLine().trim();

        // UNSTRING S DELIMITED BY ' ' INTO S LEN
        String[] parts = s.split(" ", 2);
        s = parts[0];
        len = parts.length > 1 ? parts[1].length() : 0;

        // IF LEN <= LENGTH OF K THEN DISPLAY S ELSE DISPLAY K S
        if (len <= k.length()) {
            System.out.println(s);
        } else {
            System.out.println(k + " " + s);
        }

        // STOP RUN
        System.exit(returnCode);
    }
}