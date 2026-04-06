```java
import java.util.Arrays;

public class ABC_082_A {
    private static final int MAX_SIZE = 100;
    private static final int STACK_SIZE = 1000;

    private char[] inp;
    private char[] inp2;
    private char[] sary1 = new char[MAX_SIZE];
    private char[] tary1 = new char[MAX_SIZE];
    private char[] qary1 = new char[MAX_SIZE];
    private int[][] stack1 = new int[STACK_SIZE][2];

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
    private int zs;
    private String ans;
    private char dummy;
    private int flg;
    private int judge = 9;

    public static void main(String[] args) {
        ABC_082_A program = new ABC_082_A();
        program.main();
    }

    public void main() {
        inp = new char[101];
        inp2 = new char[101];

        // Read input
        System.out.print("Enter first string: ");
        for (int i = 0; i < 101 && (inp[i] = (char) System.in.read()) != '\n'; i++) ;
        inp[i - 1] = ' '; // Corrected line

        System.out.print("Enter second string: ");
        for (int i = 0; i < 101 && (inp2[i] = (char) System.in.read()) != '\n'; i++) ;
        inp2[i - 1] = ' '; // Corrected line

        // Process first string
        int i = 0;
        while (i < 101 && inp[i] != ' ') {
            qary1[i] = inp[i];
            i++;
        }
        slast = i - 1;
        qfirst = 0;
        qlast = slast;
        partition();
        flg = 1;
        while (flg == 1) {
            qsort();
            if (flg == 0) {
                if (nowidx < sidx) {
                    flg = 1;
                    nowidx++;
                    qfirst = stack1[nowidx][0];
                    qlast = stack1[nowidx][1];
                    partition();
                }
            }
        }

        // Copy sorted array to original array
        for (i = 0; i <= slast; i++) {
            sary1[i] = qary1[i];
        }

        // Initialize arrays
        Arrays.fill(qary1, ' ');
        Arrays.fill(stack1, new int[]{0, 0});

        // Process second string
        i = 0;
        while (i < 101 && inp2[i] != ' ') {
            qary1[i] = inp2[i];
            i++;
        }
        tlast = i - 1;
        qfirst = 0;
        qlast = tlast;
        computeXlast();
        partition();
        flg = 1;
        sidx = 0;
        nowidx = 0;
        while (flg == 1) {
            qsort();
            if (flg == 0) {
                if (nowidx < sidx) {
                    flg = 1;
                    nowidx++;
                    qfirst = stack1[nowidx][0];
                    qlast = stack1[nowidx][1];
                    partition();
                }
            }
        }

        // Merge sorted arrays
        int j = tlast;
        for (i = 0; i <= tlast; i++) {
            tary1[j--] = qary1[i];
        }

        // Compare merged arrays
        for (i = 0; i <= Math.min(slast, tlast); i++) {
            if (sary1[i] < tary1[i]) {
                judge = 0;
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

    private void partition() {
        t = qary1[qlast];
        a = qfirst - 1;

        for (b = qfirst; b <= qlast; b++) {
            if (qary1[b] <= t) {
                a++;
                char temp = qary1[a];
                qary1[a] = qary1[b];
                qary1[b] = temp;
            }
        }

        char temp = qary1[a + 1];
        qary1[a + 1] = qary1[qlast];
        qary1[qlast] = temp;
        q = a + 1;
    }

    private void qsort() {
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
                flg = 0;
            }
        } else {
            flg = 0;
        }
    }

    private void computeXlast() {
        xlast = Math.min(slast, qlast);
    }
}
```