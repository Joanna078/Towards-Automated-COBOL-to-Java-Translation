import java.util.Scanner;

public class ABC_026_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data Division
        int maxA = 999;
        int n = scanner.nextInt();
        String inp = scanner.next();
        int maxlen = n;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        StringBuilder ans = new StringBuilder();

        int sm = 0;
        int cnt = 1;
        int bk = maxA;

        while (i <= maxlen) {
            j = cur;
            while (j <= maxlen && inp.charAt(j - 1) != ' ') {
                j++;
            }

            len = j - cur;
            String a = inp.substring(cur - 1, cur + len - 1);

            if (bk != Integer.parseInt(a)) {
                cnt /= 2;
                sm += cnt;
                cnt = 1;
                bk = Integer.parseInt(a);
            } else {
                cnt++;
            }

            cur = j + 1;
            i++;
        }

        cnt /= 2;
        sm += cnt;

        ans.append(sm);

        // Unans Section
        String[] parts = ans.toString().split(" ");
        for (String part : parts) {
            if (!part.isEmpty()) {
                ans.append(part);
            }
        }

        System.out.println(ans.toString());
    }
}