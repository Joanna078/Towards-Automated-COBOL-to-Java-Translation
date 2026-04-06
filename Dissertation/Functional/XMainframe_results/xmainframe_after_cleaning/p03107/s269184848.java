import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int rcnt = 0;
        int bcnt = 0;
        int len = 0;
        int ans = 0;
        StringBuilder oAns = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                rcnt++;
            } else if (s.charAt(i) == '1') {
                bcnt++;
            } else if (s.charAt(i) == ' ') {
                len = i;
                break;
            }
        }
        if (rcnt > bcnt) {
            ans = len - (rcnt - bcnt);
        } else {
            ans = len - (bcnt - rcnt);
        }
        oAns.append(ans);
        System.out.println(oAns.toString());
    }
}
