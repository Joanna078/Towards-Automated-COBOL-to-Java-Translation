import java.util.Scanner;

public class ABC_107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp2 = scanner.nextLine();
        int n = Integer.parseInt(inp2.split(" ")[0]);
        int k = Integer.parseInt(inp2.split(" ")[1]);

        String[] lines = new String[1];
        lines[0] = scanner.nextLine();

        int maxlen = n;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int tmp;
        int[][] x1 = new int[maxlen][2];
        int sm = 0;
        int flg = 0;
        StringBuilder ans = new StringBuilder();
        long zs = 0;

        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && lines[0].charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            try {
                x1[i - 1][0] = Integer.parseInt(lines[0].substring(cur - 1, cur + len - 1));
                x1[i - 1][1] = Integer.parseInt(lines[0].substring(cur - 1, cur + len - 1));
            } catch (NumberFormatException e) {
                // Handle the case where the substring is not a valid integer
                x1[i - 1][0] = 0;
                x1[i - 1][1] = 0;
            }
            cur = j + 1;
            i++;
        }

        if (x1[0][0] >= 0) {
            sm = x1[k - 1][1];
            flg = 1;
        }

        tmp = n - k + 1;

        if (x1[n - 1][0] <= 0) {
            sm = x1[tmp - 1][1];
            flg = 1;
        }

        if (flg == 0) {
            sm = 150000000;
            for (i = 1; i <= n; i++) {
                tmp = i + k - 1;
                if (n < tmp) break;
                if (x1[i - 1][0] <= 0) {
                    if (x1[tmp - 1][0] >= 0) {
                        long t;
                        if (x1[i - 1][1] <= x1[tmp - 1][1]) {
                            t = x1[i - 1][1] * 2L + x1[tmp - 1][1];
                        } else {
                            t = x1[i - 1][1] + x1[tmp - 1][1] * 2L;
                        }
                        if (t < sm) {
                            sm = (int) t;
                        }
                    } else {
                        tmp = i + k;
                        if (tmp <= n && x1[tmp - 1][0] > 0) {
                            long t = x1[i - 1][1];
                            if (t < sm) {
                                sm = (int) t;
                            }
                        }
                    }
                } else {
                    tmp = i - 1;
                    if (x1[tmp - 1][0] < 0) {
                        long t = x1[tmp - 1][1];
                        if (t < sm) {
                            sm = (int) t;
                        }
                    }
                }
            }
        }

        zs = sm;
        unans(zs, ans);

        System.out.println(ans.toString());
    }

    private static void unans(long zs, StringBuilder ans) {
        String[] parts = Long.toString(zs).split("");
        for (String part : parts) {
            ans.append(part);
        }
    }
}