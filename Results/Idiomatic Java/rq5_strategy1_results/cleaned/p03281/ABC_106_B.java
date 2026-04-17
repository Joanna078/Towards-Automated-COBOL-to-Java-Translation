import java.util.Scanner;

public class ABC_106_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private int n;
    private int cnt = 0;
    private int tmp = 0;

    public static void main(String[] args) {
        ABC_106_B program = new ABC_106_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i += 2) {
            tmp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    tmp++;
                }
            }
            if (tmp == 8) {
                cnt++;
            }
        }

        System.out.println("Result: " + cnt);
    }
}