import java.util.Scanner;

public class PROGRAM_ID {

    private int returnCode = 0;
    private String s = "";
    private String t = "";

    public static void main(String[] args) {
        PROGRAM_ID program = new PROGRAM_ID();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for S: ");
        s = scanner.nextLine();

        System.out.print("Enter value for T: ");
        t = scanner.nextLine();

        if (s.length() == t.length() - 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}