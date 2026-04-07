import java.util.Arrays;

public class ABC_082_A {
    private static final int MAX_SIZE = 100;
    private static final int STACK_SIZE = 1000;

    private char[] inp;
    private char[] inp2;
    private char[][] sary1 = new char[MAX_SIZE][];
    private char[][] tary1 = new char[MAX_SIZE][];
    private char[][] qary1 = new char[MAX_SIZE][];
    private int[][] stack1 = new int[STACK_SIZE][];

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

    public void main() {
        inp = new char[101];
        inp2 = new char[101];

        // Read input
        System.out.print("Enter first string: ");
        for (int i = 0; i < 101 && (inp[i] = (char) System.in.read()) != '\n'; i++) ;
        inp[i] = ' ';

        System.out.print("Enter second string: ");
        for (int i = 0; i < 101 && (inp2[i] = (char) System.in.read()) != '\n'; i++) ;
        inp2[i] = ' ';

        // Process first string
        int i = 1;
        while (i <= 100 && inp[i] != ' ') {
            sary1[i - 1] = new char[]{inp[i]};
            i++;
        }
        slast = i - 2;
        qfirst = 1;
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
        for (i = 1; i <= slast; i++) {
            sary11[i - 1] = new char[]{qary11[i - 1][0]};
        }

        // Initialize arrays
        Arrays.fill(qary1, null);
        Arrays.fill(stack1, null);

        // Process second string
        i = 1;
        while (i <= 100 && inp2[i] != ' ') {
            tary1[i - 1] = new char[]{inp2[i]};
            i++;
        }
        tlast = i - 2;
        qfirst = 1;
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
        j = tlast;
        for (i = 1; i <= tlast; i++) {
            tary11[j--] = new char[]{qary11[i - 1][0]};
        }

        // Compare merged arrays
        for (i = 1; i <= Math.min(slast, tlast); i++) {
            if (sary11[i - 1][0] < tary11[i - 1][0]) {
                judge = 0;
                break;
            } else if (tary11[i - 1][0] < sary11[i - 1][0]) {
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
        t = qary11[qlast][0];
        a = q