import java.util.Scanner;

public class Test1 {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private String a = "000000";
    private String b = "000000";
    private String c = "000000000";
    private String ren = "0000000";
    private String re = "0000000";
    private int temp1 = 0;
    private int temp2 = 0;
    private int n = 0;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();

        processInput();
        displayResult();
    }

    private void initialize() {
        initialized = true;
    }

    private void processInput() {
        temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        a = inp.substring(0, temp1);

        temp1++;
        temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        b = inp.substring(temp1, temp2);

        temp2++;
        temp1 = temp2;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        c = inp.substring(temp2, temp1);

        n = Integer.parseInt(b) - Integer.parseInt(a);
        ren = String.format("%07d", n);

        n = Integer.parseInt(c) - Integer.parseInt(b);
        re = String.format("%07d", n);
    }

    private void displayResult() {
        if (a.equals(b) && !b.equals(c)) {
            System.out.println("2");
        } else if (!a.equals(b) && b.equals(c)) {
            System.out.println("2");
        } else if (a.equals(c) && !b.equals(c)) {
            System.out.println("2");
        } else if (a.equals(c) && b.equals(c)) {
            System.out.println("1");
        } else {
            System.out.println("3");
        }
    }
}