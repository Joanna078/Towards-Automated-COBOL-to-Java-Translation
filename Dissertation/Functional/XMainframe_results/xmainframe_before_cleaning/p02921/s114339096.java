import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int len = 3;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}