import java.util.Scanner;

public class ABC_056_B {

    private boolean initialized = false;
    private String inp;
    private int w;
    private int a;
    private int b;
    private String ans;
    private int tmp;
    private int zs;
    private char dummy;

    public static void main(String[] args) {
        new ABC_056_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        String[] parts = inp.split("\\s+");
        w = Integer.parseInt(parts[0]);
        a = Integer.parseInt(parts[1]);
        b = Integer.parseInt(parts[2]);

        if (b < a) {
            tmp = b;
            b = a;
            a = tmp;
        }

        w += a;

        if (b < a) {
            System.out.println("0");
        } else {
            b -= a;
            zs = b;
            unans();
            System.out.println(ans);
        }
    }

    private void unans() {
        String[] parts = String.valueOf(zs).split("\\s+");
        ans = parts[1];
    }
}