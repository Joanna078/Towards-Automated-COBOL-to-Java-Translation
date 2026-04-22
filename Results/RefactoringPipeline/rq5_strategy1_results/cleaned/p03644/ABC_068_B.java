import java.util.Scanner;

public class ABC_068_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private int i, j, N, t, tmp, R, mxt, mxv;
    private String ans = " ".repeat(18);
    private int ZS;

    public static void main(String[] args) {
        ABC_068_B program = new ABC_068_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        N = scanner.nextInt();
        scanner.close();

        if (!initialized) {
            initialize();
        }

        mainSection();
        unansSection();
        displayResult();
    }

    private void initialize() {
        returnCode = 0;
        i = 0;
        j = 0;
        N = 0;
        t = 0;
        tmp = 0;
        R = 0;
        mxt = 0;
        mxv = 0;
        ans = " ".repeat(18);
        ZS = 0;
        initialized = true;
    }

    private void mainSection() {
        mxv = 1;
        mxt = 0;

        for (i = 1; i <= N; i++) {
            t = 0;
            tmp = i;

            for (j = 1; j <= tmp; j++) {
                t++;
                R = tmp % 2;

                if (R == 1) {
                    break;
                }
            }

            if (t > mxt) {
                mxv = i;
                mxt = t;
            }
        }

        ZS = mxv;
    }

    private void unansSection() {
        String[] parts = String.valueOf(ZS).split(" ");
        ans = parts[0];
    }

    private void displayResult() {
        System.out.println(ans.trim());
    }
}