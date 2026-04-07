import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        int k = Integer.parseInt(ln.split(" ")[1]);
        int x = Integer.parseInt(ln.split(" ")[2]);
        int i = x - k + 1;
        int nl = 0;
        int sp = 0;
        int st = x - k + 1;
        int ed = x + k - 1;
        StringBuilder ans = new StringBuilder();

        if (k == 1) {
            nl = 1;
            display(i, sp, nl, ans);
            System.exit(0);
        } else {
            display(i, sp, nl, ans);
        }

        sp = 1;
        st++;
        while (ed >= st) {
            display(i, sp, nl, ans);
            st++;
        }

        nl = 1;
        display(i, sp, nl, ans);

        System.out.println(ans.toString());
    }

    private static void display(int i, int sp, int nl, StringBuilder ans) {
        if (sp != 0) {
            ans.append(' ');
        }
        if (i != 0) {
            if (nl != 0) {
                ans.append(String.format("%d", i));
            } else {
                ans.append(String.format("%d", i)).append(' ');
            }
        } else {
            if (nl != 0) {
                ans.append("0");
            } else {
                ans.append("0").append(' ');
            }
        }
    }
}