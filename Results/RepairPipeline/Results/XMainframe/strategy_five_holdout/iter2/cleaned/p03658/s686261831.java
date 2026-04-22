import java.util.Scanner;

public class ABC_067_B {
    static char[] NK = new char[5];
    static int N;
    static int K;

    static int mx;

    static char[] INP = new char[2550];
    static int maxlen;
    static int cur = 1;
    static long i;
    static long j;
    static int len;

    static int[] qary = new int[100];

    static int[][] stack1 = new int[1000][2];
    static int sidx = 0;
    static int nowidx = 0;

    static int sttmp;
    static int edtmp;

    static int a;
    static int b;

    static int t;
    static int x;

    static int qfirst;
    static int qlast;
    static int q;

    static int ret;
    static int bk;

    static String ZS = "     ";
    static char[] ans = new char[4];

    static char DUMMY;

    static int FLG;

    static int num = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NK = scanner.nextLine().toCharArray();

        String[] nkParts = new String(NK).trim().split(" ");
        N = Integer.parseInt(nkParts[0]);
        K = Integer.parseInt(nkParts[1]);

        INP = scanner.nextLine().toCharArray();
        scanner.close();

        maxlen = N;

        for (i = 1; i <= maxlen; i++) {
            for (j = cur; j <= INP.length; j++) {
                if (INP[(int) j - 1] == ' ') break;
            }
            len = (int) j - cur;
            for (int k = 0; k < len; k++) {
                qary[(int) i - 1] = Character.getNumericValue(INP[cur - 1 + k]);
            }
            cur = (int) j + 1;
        }

        qfirst = 1;
        qlast = N;

        partition();

        FLG = 1;

        while (FLG != 0) {
            qsort();
            if (FLG == 0) {
                if (nowidx < sidx) {
                    FLG = 1;
                    nowidx++;
                    qfirst = stack1[nowidx - 1][0];
                    qlast = stack1[nowidx - 1][1];
                    partition();
                }
            }
        }

        mx = 0;

        for (i = N; i >= N - K + 1; i--) {
            mx += qary[(int) i - 1];
        }

        ZS = String.format("%05d", mx);

        unans();

        System.out.print(new String(ans).substring(0, ans.length()));
    }

    static void unans() {
        String[] zsParts = ZS.trim().split(" ");
        DUMMY = zsParts[0].charAt(0);
        ans = zsParts[1].toCharArray();
    }

    static void partition() {
        x = qary[qlast - 1];
        a = qfirst - 1;

        for (b = qfirst; b <= qlast; b++) {
            if (qary[b - 1] <= x) {
                a++;
                t = qary[a - 1];
                qary[a - 1] = qary[b - 1];
                qary[b - 1] = t;
            }
        }

        a++;
        t = qary[a - 1];
        qary[a - 1] = qary[qlast - 1];
        qary[qlast - 1] = t;
        q = a;
    }

    static void qsort() {
        if (qfirst < qlast) {
            ret = q;
            qlast = bk = qlast - 1;
            ret++;
            sttmp = ret;
            edtmp = bk;

            if (sttmp < edtmp) {
                sidx++;
                stack1[sidx - 1][0] = sttmp;
                stack1[sidx - 1][1] = edtmp;
            }

            if (qfirst < qlast) {
                partition();
            } else {
                FLG = 0;
            }
        } else {
            FLG = 0;
        }
    }
}