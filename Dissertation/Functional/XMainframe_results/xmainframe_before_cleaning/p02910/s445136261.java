import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                cnt++;
            }
        }
        cnt += 1;
        String out = "Yes";
        int sw = 0;
        for (int i = 0; i < cnt; i++) {
            char x = s.charAt(i);
            boolean r = x == 'R' || x == 'U' || x == 'D';
            boolean l = x == 'L' || x == 'U' || x == 'D';
            if (!(sw == 0 && r || sw == 1 && l)) {
                out = "No";
            }
            sw = 1 - sw;
        }
        System.out.println(out);
    }
}