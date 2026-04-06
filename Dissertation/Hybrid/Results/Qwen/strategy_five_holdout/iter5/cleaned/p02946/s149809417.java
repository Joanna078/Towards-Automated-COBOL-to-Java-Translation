import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        int k = Integer.parseInt(ln.split(" ")[0]);
        int x = Integer.parseInt(ln.split(" ")[1]);
        int i = x - k + 1;
        int nl = 0;
        int sp = 0;
        int st = x - k + 1;
        int ed = x + k - 1;

        if (k == 1) {
            nl = 1;
            display(i, sp, nl);
            System.exit(0);
        } else {
            display(i, sp, nl);
        }

        sp = 1;
        st++;
        while (st <= ed) {
            display(st, sp, nl);
            st++;
        }

        nl = 1;
        display(ed, sp, nl);
    }

    private static void display(int i, int sp, int nl) {
        if (sp != 0) {
            System.out.print(" ");
        }
        if (i != 0) {
            if (nl != 0) {
                System.out.print(i);
            } else {
                System.out.print(i + " ");
            }
        } else {
            if (nl != 0) {
                System.out.print("0");
            } else {
                System.out.print("0 ");
            }
        }
    }
}