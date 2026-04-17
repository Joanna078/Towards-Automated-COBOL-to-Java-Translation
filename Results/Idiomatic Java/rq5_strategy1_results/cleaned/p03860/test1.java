import java.util.Scanner;

public class Test1 {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private String a = "";
    private String b = "";
    private String c = "";

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        processInput();
        displayResult();
    }

    private void processInput() {
        int temp1 = 0;
        int temp2 = 0;

        // Find the first space in inp
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                temp1 = i;
                break;
            }
        }

        // Extract A
        a = inp.substring(0, temp1);

        // Find the second space in inp
        for (int i = temp1 + 1; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                temp2 = i;
                break;
            }
        }

        // Extract B
        b = inp.substring(temp1 + 1, temp2);

        // Compute N
        int n = Integer.parseInt(b) - Integer.parseInt(a);

        // Extract C
        c = inp.substring(temp2 + 1);

        // Compute N again
        n = Integer.parseInt(c) - Integer.parseInt(b);
    }

    private void displayResult() {
        System.out.println("A: " + b + " C: " + c);
    }
}