import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int maxlen = 26;
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int[] f = new int[maxlen];
        Arrays.fill(f, 0);

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            for (int j = 0; j < maxlen; j++) {
                if (c == alpha.charAt(j)) {
                    f[j] = 1;
                }
            }
        }

        for (int i = 0; i < maxlen; i++) {
            if (f[i] == 0) {
                System.out.println(alpha.charAt(i));
                break;
            } else if (i == maxlen - 1) {
                System.out.println("None");
            }
        }
    }
}
