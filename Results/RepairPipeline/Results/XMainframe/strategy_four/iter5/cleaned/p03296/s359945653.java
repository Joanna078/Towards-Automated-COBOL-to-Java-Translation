import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        String s = sc.nextLine();
        int sm = 0;
        int cnt = 1;
        int prev = Character.getNumericValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (prev != num) {
                sm += cnt / 2;
                cnt = 1;
            } else {
                cnt++;
            }
            prev = num;
        }
        sm += cnt / 2;
        String zs = String.format("%03d", sm);
        String ans = "";
        for (char c : zs.toCharArray()) {
            if (c != '0') {
                ans += c;
            }
        }
        System.out.println(ans);
    }
}