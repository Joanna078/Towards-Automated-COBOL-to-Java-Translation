import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int len = S.length();
        boolean[] flg = new boolean[26];
        Arrays.fill(flg, false);
        boolean used = false;
        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            if (flg[c - 'a']) {
                used = true;
                break;
            }
            flg[c - 'a'] = true;
        }
        System.out.println(used ? "no" : "yes");
    }
}