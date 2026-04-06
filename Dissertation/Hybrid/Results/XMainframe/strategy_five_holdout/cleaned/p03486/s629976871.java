import java.io.*;

public class Main {
    static String INP;
    static String INP2;
    static char[] sary11;
    static char[] tary11;
    static char[] qary11;
    static int[][] stack11;
    static int sidx;
    static int nowidx;
    static int sttmp;
    static int edtmp;
    static int a;
    static int b;
    static char t;
    static char x;
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

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        INP = reader.readLine();
        INP2 = reader.readLine();
        sary11 = new char[101];
        tary11 = new char[101];
        qary11 = new char[101];
        stack11 = new int[1000][2];
        for (int i = 0; i < INP.length(); i++) {
            qary11[i] = INP.charAt(i);
        }
        slast = INP.length() - 1;
        qfirst = 0;
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
        for (int i = 0; i <= slast; i++) {
            sary11[i] = qary11[i];
        }
        for (int i = 0; i <= slast; i++) {
            qary11[i] = '\0';
        }
        for (int i = 0; i < INP2.length(); i++) {
            qary11[i] = INP2.charAt(i);
        }
        tlast = INP2.length() - 1;
        qfirst = 0;
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
        for (int i = 0; i <= tlast; i++) {
            tary11[i] = qary11[i];
        }
        xlast = Math.min(slast, tlast);
        judge = 9;
        for (int i = 0; i <= xlast; i++) {
            if (qary11[i] < tary11[i]) {
                judge = 0;
                break;
            } else if (qary11[i] > tary11[i]) {
                judge = 1;
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

    static void partition() {
        x = qary11[qlast];
        a = qfirst - 1;
        for (b = qfirst; b < qlast; b++) {
            if (qary11[b] <= x) {
                a++;
                t = qary11[a];
                qary11[a] = qary11[b];
                qary11[b] = t;
            }
        }
        a++;
        t = qary11[a];
        qary11[a] = qary11[qlast];
        qary11[qlast] = t;
        q = a;
    }

    static void qsort() {
        if (qfirst < qlast) {
            ret = q;
            bk = qlast;
            ret--;
            sttmp = ret + 1;
            edtmp = bk;
            if (sttmp < edtmp) {
                sidx++;
                stack11[sidx][0] = sttmp;
                stack11[sidx][1] = edtmp;
            }
            if (qfirst < qlast) {
                partition();
            } else {
                flg = 0;
            }
        } else {
            flg = 0;
        }
    }
}