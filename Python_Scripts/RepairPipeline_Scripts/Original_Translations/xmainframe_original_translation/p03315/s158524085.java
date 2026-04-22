import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = 1;
        int i;
        String ans = "";
        int ss = 0;
        int zs;
        char dummy;

        for (i = 0; i < 4; i++) {
            if (s.charAt(i) == '+') {
                ss++;
            } else {
                ss--;
            }
        }

        ans = Integer.toString(ss);

        System.out.println(ans);
    }
}
