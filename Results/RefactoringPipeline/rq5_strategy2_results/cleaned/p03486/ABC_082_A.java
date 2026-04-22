import java.util.Arrays;

public class ABC_082_A {

    private char[] inp = new char[101];
    private char[] inp2 = new char[101];

    private int i;
    private int j;

    private char[] sary1 = new char[100];
    private char[] tary1 = new char[100];
    private char[] qary1 = new char[100];

    private int[][] stack1 = new int[1000][2];
    private int sidx = 0;
    private int nowidx = 0;

    private int sttmp;
    private int edtmp;

    private int a;
    private int b;

    private char t;
    private char x;

    private int qfirst;
    private int qlast;
    private int q;

    private int slast;
    private int tlast;
    private int xlast;

    private int ret;
    private int bk;

    private int ZS;
    private char[] ans = new char[5];

    private char DUMMY;

    private int FLG;

    private int judge = 9;

    public static void main(String[] args) {
        ABC_082_A program = new ABC_082_A();
        program.run();
    }

    public void run() {
        readInput(inp);
        readInput(inp2);

        for (i = 0; i < inp.length && inp[i] != ' '; i++) {
            qary1[i] = inp[i];
        }
        slast = i - 1;

        qfirst = 1;
        qlast = slast;

        partition();

        FLG = 1;

        while (FLG != 0) {
            quickSort();
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

        for (i = 0; i <= slast; i++) {
            sary1[i] = qary1[i];
        }

        Arrays.fill(qary1, ' ');
        Arrays.fill(stack1, new int[]{0, 0});

        for (i = 0; i < inp2.length && inp2[i] != ' '; i++) {
            qary1[i] = inp2[i];
        }
        tlast = i - 1;

        qfirst = 1;
        qlast = tlast;

        xlast = Math.min(slast, qlast);

        partition();

        sidx = 0;
        nowidx = 0;

        FLG = 1;

        while (FLG != 0) {
            quickSort();
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

        j = tlast;

        for (i = 0; i <= tlast; i++) {
            tary1[i] = qary1[j];
            j--;
        }

        for (i = 0; i <= xlast; i++) {
            if (sary1[i] < tary1[i]) {
                judge = 1;
                break;
            } else if (tary1[i] < sary1[i]) {
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

    private void readInput(char[] array) {
        // Simulate reading input, for example:
        // array = "your input string".toCharArray();
    }

    private void partition() {
        x = qary1[qlast - 1];
        a = qfirst - 1;

        for (b = qfirst; b <= qlast; b++) {
            if (qary1[b - 1] <= x) {
                a++;
                t = qary1[a - 1];
                qary1[a - 1] = qary1[b - 1];
                qary1[b - 1] = t;
            }
        }

        a++;
        t = qary1[a - 1];
        qary1[a - 1] = qary1[qlast - 1];
        qary1[qlast - 1] = t;
        q = a;
    }

    private void quickSort() {
        if (qfirst < qlast) {
            ret = q;
            bk = qlast;
            ret--;

            sttmp = ret + 1;
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