import java.util.Scanner;

public class ABC_060_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp;
    private int a;
    private int b;
    private int c;
    private int num;
    private int i;
    private int pi;
    private boolean flg;

    public static void main(String[] args) {
        ABC_060_B program = new ABC_060_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
        c = Integer.parseInt(parts[2]);

        num = a;
        i = 1;
        flg = false;

        while (true) {
            if ((long) a * b > num) {
                break;
            }
            if (num % b == c) {
                flg = true;
                break;
            }
            pi = i + 1;
            num = pi * a;
            i++;
        }

        if (flg) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}