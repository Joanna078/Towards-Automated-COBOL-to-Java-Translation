import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        String e = sc.next();
        int len = o.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(o.charAt(i));
            sb.append(e.charAt(i));
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
