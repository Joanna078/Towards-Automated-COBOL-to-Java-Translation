import java.util.Scanner;

public class ABC_042_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int maxlen = 51;
    private int cur = 1;
    private int i = 1;
    private int j = 0;
    private int len = 0;
    private String ans = "";
    private int five = 0;
    private int seven = 0;
    private String abc1 = "";

    public static void main(String[] args) {
        ABC_042_A program = new ABC_042_A();
        program.execute();
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
        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            abc1 += inp.substring(cur - 1, cur + len - 1);
            cur = j + 1;
        }

        for (i = 1; i <= 3; i++) {
            if (abc1.substring(2 * (i - 1), 2 * i).equals("5")) {
                five++;
            } else if (abc1.substring(2 * (i - 1), 2 * i).equals("7")) {
                seven++;
            }
        }
    }

    private void displayResult() {
        if (five == 2 && seven == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}