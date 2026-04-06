import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        char s1 = inp.charAt(0);
        String s9 = inp.substring(2);
        char[] s99 = s9.toCharArray();

        inp = scanner.nextLine();
        String t = inp;

        int idx = 0;
        while (s99[idx] != ' ') {
            idx++;
        }

        char[] wk_s100 = new char[100];
        int cnt = 0;
        while (!t.equals(s9)) {
            System.arraycopy(s9.toCharArray(), 0, wk_s100, idx, s9.length());
            wk_s100[idx] = s1;
            s9 = new String(wk_s100);
            cnt++;
        }

        if (t.equals(s9)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}