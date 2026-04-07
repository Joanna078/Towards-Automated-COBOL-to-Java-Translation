<|assistant|>
```java
import java.io.*;

public class Main {
    static String INP;
    static String INP2;
    static int[] sary11;
    static int[] tary11;
    static int[] qary11;
    static int[][] stack11;
    static int sidx;
    static int nowidx;
    static int sttmp;
    static int edtmp;
    static int a;
    static int b;
    static int t;
    static int x;
    static int qfirst;
    static int qlast;
    static int q;
    static int slast;
    static int tlast;
    static int xlast;
    static int ret;
    static int bk;
    static String ZS;
    static String ans;
    static int flg;
    static int judge;

    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        INP = reader.readLine();
        INP2 = reader.readLine();
        sary11 = new int[101];
        tary11 = new int[101];
        qary11 = new int[101];
        stack11 = new int[1000][2];
        for (int i = 0; i < INP.length(); i++) {
            sary11[i + 1] = Integer.parseInt(INP.substring(i, i + 1));
        }
        slast = INP.length();
        qfirst = 1;
        qlast = slast;
        partition();
        flg = 1;
        while (flg != 0) {
            qsort();
            if (flg == 0) {
                if (nowidx < sidx) {
                    flg = 1;
                    nowidx++;
                    qfirst = stack11[nowidx][0];
                    qlast = stack11[nowidx][1];
                    partition();
                }
            }
        }
        for (int i = 1; i <= slast; i++) {
            qary11[i] = sary11[qary11[i]];
        }
        for (int i = 1; i <= slast; i++) {
            qary11[i] = 0;
        }
        for (int i = 0; i < INP2.length(); i++) {
            qary11[i + 1] = Integer.parseInt(INP2.substring(i, i + 1));
        }
        tlast = INP2.length();
        qfirst = 1;
        qlast = tlast;
        partition();
        sidx = 0;
        nowidx = 0;
        flg = 1;
        while (flg != 0) {
            qsort();
            if (flg == 0) {
                if (nowidx < sidx) {
                    flg = 1;
                    nowidx++;
                    qfirst = stack11[nowidx][0];
                    qlast = stack11[nowidx][1];
                    partition();
                }
            }
        }
        for (int i = 1; i <= tlast; i++) {
            tary11[i] = qary11[tary11[i]];
        }
        for (int i = 1; i <= tlast; i++) {
            if (qary11[i] < qary11[i + tlast]) {
                judge = 9;
                break;
            } else if (qary11[i] > qary11[i + tlast]) {
                judge = 0;
                break;
            }
        }
        if (tlast <= slast && judge == 9) {
            judge = 0;
        }
        if (judge == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    static void partition() throws Exception {
        x = qary11[qlast];
        a = qfirst - 1;
        for (b = qfirst; b <= qlast;