import java.util.Scanner;

public class ABC_047_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp;
    private int a;
    private int b;
    private int c;
    private int x;
    private int q;
    private int r;

    public static void main(String[] args) {
        ABC_047_A program = new ABC_047_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        if (parts.length != 3) {
            System.out.println("No");
            return;
        }

        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            c = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("No");
            return;
        }

        x = a + b + c;
        q = x / 2;
        r = x % 2;

        if (r == 0) {
            System.out.println("No");
        } else if (a == q || b == q || c == q) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}