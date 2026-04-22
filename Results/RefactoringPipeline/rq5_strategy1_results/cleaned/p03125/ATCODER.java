import java.util.Scanner;

public class ATCODER {

    private boolean initialized = false;
    private int returnCode = 0;
    private String indata = "";
    private int a1 = 0;
    private int a2 = 0;
    private int a3 = 0;
    private int r = 0;
    private int g = 0;
    private String disp = "";

    public static void main(String[] args) {
        new ATCODER().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split("\\s+");
        if (parts.length >= 2) {
            a1 = Integer.parseInt(parts[0]);
            a2 = Integer.parseInt(parts[1]);
        }

        if (a2 % a1 > 0) {
            a3 = a2 - a1;
        } else {
            a3 = a2 + a1;
        }

        disp = String.valueOf(a3);
        System.out.println(disp);
    }
}