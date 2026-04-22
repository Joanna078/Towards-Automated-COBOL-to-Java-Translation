import java.util.Scanner;

public class ABC_081_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private char i = '0';
    private String inp = "   ";
    private char cnt = '0';
    private int zs = 0;
    private char ans = ' ';
    private char dummy = ' ';

    public static void main(String[] args) {
        new ABC_081_A().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().substring(0, Math.min(inp.length(), scanner.nextLine().length()));

        cnt = '0';
        i = '1';

        for (; i <= '3'; i++) {
            if (inp.charAt(i - '1') == '1') {
                cnt++;
            }
        }

        zs = cnt;
        unans();
        System.out.println(ans);
    }

    private void unans() {
        String[] parts = String.valueOf(zs).split(" ");
        dummy = parts[0].charAt(0);
        ans = parts[1].charAt(0);
    }
}