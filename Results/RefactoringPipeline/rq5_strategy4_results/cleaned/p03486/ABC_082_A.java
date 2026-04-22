import java.util.Arrays;
import java.util.Scanner;

public class ABC_082_A {

    private static final int MAX_SIZE = 100;
    private static final int STACK_SIZE = 1000;

    private char[] inp = new char[101];
    private char[] inp2 = new char[101];

    private int i, j;
    private char[] sary1 = new char[MAX_SIZE];
    private char[] tary1 = new char[MAX_SIZE];
    private char[] qary1 = new char[MAX_SIZE];
    private int[][] stack1 = new int[STACK_SIZE][2];
    private int sidx = 0, nowidx = 0;
    private int sttmp, edtmp;
    private int a, b;
    private char t, x;
    private int qfirst, qlast, q;
    private int slast, tlast, xlast;
    private int ret, bk;
    private int judge = 9;

    public static void main(String[] args) {
        ABC_082_A program = new ABC_082_A();
        program.run();
    }

    public void run() {
        readInput(inp);
        readInput(inp2);

        processInput(inp, qary1);
        slast = i - 1;
        qfirst = 0;
        qlast = slast;
        partition(qary1, qfirst, qlast);

        int flg = 1;
        while (flg != 0) {
            quickSort(qary1, qfirst, qlast);
            if (flg == 0 && nowidx < sidx) {
                flg = 1;
                nowidx++;
                qfirst = stack1[nowidx - 1][0];
                qlast = stack1[nowidx - 1][1];
                partition(qary1, qfirst, qlast);
            }
        }

        for (i = 0; i <= slast; i++) {
            sary1[i] = qary1[i];
        }

        Arrays.fill(qary1, ' ');
        Arrays.fill(stack1, new int[]{0, 0});

        processInput(inp2, qary1);
        tlast = i - 1;
        qfirst = 0;
        qlast = tlast;
        xlast = Math.min(slast, qlast);
        partition(qary1, qfirst, qlast);

        sidx = 0;
        nowidx = 0;
        flg = 1;
        while (flg != 0) {
            quickSort(qary1, qfirst, qlast);
            if (flg == 0 && nowidx < sidx) {
                flg = 1;
                nowidx++;
                qfirst = stack1[nowidx - 1][0];
                qlast = stack1[nowidx - 1][1];
                partition(qary1, qfirst, qlast);
            }
        }

        for (i = 0; i <= tlast; i++) {
            tary1[i] = qary1[tlast - i];
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

    private void readInput(char[] buffer) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        String input = scanner.next();
        input.getChars(0, Math.min(input.length(), 101), buffer, 0);
        Arrays.fill(buffer, input.length(), 101, ' ');
    }

    private void processInput(char[] input, char[] output) {
        i = 0;
        while (i < 101 && input[i] != ' ') {
            output[i] = input[i];
            i++;
        }
    }

    private void partition(char[] array, int first, int last) {
        x = array[last];
        a = first - 1;
        for (b = first; b <= last; b++) {
            if (array[b] <= x) {
                a++;
                t = array[a];
                array[a] = array[b];
                array[b] = t;
            }
        }
        q = a + 1;
    }

    private void quickSort(char[] array, int first, int last) {
        if (first < last) {
            partition(array, first, last);
            ret = q - 1;
            bk = last;
            sttmp = ret + 1;
            edtmp = bk;
            if (sttmp < edtmp) {
                stack1[sidx++] = new int[]{sttmp, edtmp};
            }
            if (first < last) {
                partition(array, first, last);
            } else {
                flg = 0;
            }
        } else {
            flg = 0;
        }
    }
}