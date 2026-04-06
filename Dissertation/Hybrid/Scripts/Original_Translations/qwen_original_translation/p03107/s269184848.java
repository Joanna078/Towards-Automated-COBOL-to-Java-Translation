import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rcnt = 0;
        int bcnt = 0;
        int len = 0;
        int ans = 0;
        int idx = 0;

        while (idx < input.length()) {
            char sa = input.charAt(idx);
            if (sa == '0') {
                rcnt++;
            } else if (sa == '1') {
                bcnt++;
            } else if (sa == ' ') {
                len = idx;
                break;
            }
            idx++;
        }

        if (rcnt > bcnt) {
            ans = len - (rcnt - bcnt);
        } else {
            ans = len - (bcnt - rcnt);
        }

        System.out.println(ans);
    }
}