import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        int len = w.length();
        int[] cnt = new int[26];
        Arrays.fill(cnt, 0);
        boolean isEven = true;
        for (int i = 0; i < len; i++) {
            char c = w.charAt(i);
            if ('a' <= c && c <= 'z') {
                cnt[c - 'a']++;
            } else if ('A' <= c && c <= 'Z') {
                cnt[c - 'A']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 != 0) {
                isEven = false;
                break;
            }
        }
        System.out.println(isEven ? "Yes" : "No");
    }
}
