```java
import java.util.Arrays;
import java.util.Scanner;

public class ABC_067_B {

    private static int N;
    private static int K;
    private static int[] qary;
    private static int qfirst;
    private static int qlast;
    private static int sidx;
    private static int nowidx;
    private static int[] st = new int[1000];
    private static int[] ed = new int[1000];
    private static int FLG;
    private static int mx;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept NK
        String NK = scanner.nextLine();
        String[] nkParts = NK.split("\\s+");
        N = Integer.parseInt(nkParts[0]);
        K = Integer.parseInt(nkParts[1]);

        // Accept INP
        String INP = scanner.nextLine();
        String[] inpParts = INP.split("\\s+");

        // Initialize qary
        qary = new int[N];
        for (int i = 0; i < N; i++) {
            qary[i] = Integer.parseInt(inpParts[i]);
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
                    qfirst = st[nowidx - 1];
                    qlast = ed[nowidx - 1];
                    partition();
                }
            }
        }

        mx = 0;
        for (int i = N - 1; i >= N - K; i--) {
            mx += qary[i];
        }

        System.out.printf("%04d%n", mx);
    }

    private static void partition() {
        int x = qary[qlast - 1];
        int a = qfirst - 1;
        for (int b = qfirst; b <= qlast; b++) {
            if (qary[b - 1] <= x) {
                a++;
                int temp = qary[a - 1];
                qary[a - 1] = qary[b - 1];
                qary[b - 1] = temp;
            }
        }
        int temp = qary[a];
        qary[a] = qary[qlast];
        qary[qlast] = temp;
        int q = a + 1;
    }

    private static void qsort() {
        if (qfirst < qlast) {
            int ret = qfirst;
            int bk = qlast;
            ret--;
            int sttmp = ret + 1;
            int edtmp = bk;

            if (sttmp < edtmp) {
                sidx++;
                st[sidx - 1] = sttmp;
                ed[sidx - 1] = edtmp;
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
```