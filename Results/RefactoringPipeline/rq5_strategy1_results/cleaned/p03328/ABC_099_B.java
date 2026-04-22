import java.util.Scanner;

public class ABC_099_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private int ablen = 0;
    private int cur = 0;
    private String inp = "";
    private int i = 0;
    private int j = 0;
    private int len = 0;
    private String ab = "";
    private int div = 0;
    private int s = 0;
    private int t = 0;
    private int ans = 0;

    public static void main(String[] args) {
        new ABC_099_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        ablen = inp.length();
        cur = 1;

        for (int n0 = ablen; n0 > 0; n0--) {
            j = cur;
            while (inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            ab += inp.substring(cur - 1, cur + len - 1);
            cur = j + 1;
            i++;
        }

        div = Integer.parseInt(ab.substring(10, 20)) - Integer.parseInt(ab.substring(0, 10));
        s = 0;
        i = 1;

        for (int n1 = div; n1 > 0; n1--) {
            s += i;
            i++;
        }

        t = s - Integer.parseInt(ab.substring(10, 20));
        ans = t;

        System.out.println("Answer: " + ans);
    }
}