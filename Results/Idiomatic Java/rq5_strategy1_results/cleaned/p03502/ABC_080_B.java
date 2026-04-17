import java.util.Scanner;

public class ABC_080_B {

    private static final int MAX_DIGITS = 9;
    private static final int HARSHAD_LENGTH = 2;

    private int returnCode;
    private String n;
    private String d;
    private String r;
    private String harshad;

    public static void main(String[] args) {
        ABC_080_B program = new ABC_080_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextLine();

        if (n.length() > MAX_DIGITS) {
            System.out.println("Number too large.");
            return;
        }

        d = n;
        harshad = "00";

        for (int i = 0; i < d.length(); i++) {
            int digit = Character.getNumericValue(d.charAt(i));
            int harshadValue = Integer.parseInt(harshad);
            harshadValue += digit;
            harshad = String.format("%02d", harshadValue);
        }

        int number = Integer.parseInt(n);
        int harshadValue = Integer.parseInt(harshad);
        r = String.valueOf(number % harshadValue);

        if (r.equals("0")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}