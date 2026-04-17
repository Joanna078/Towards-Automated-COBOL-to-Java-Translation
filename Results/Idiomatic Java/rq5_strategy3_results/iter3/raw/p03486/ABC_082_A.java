```java
import java.io.IOException;
import java.util.Arrays;

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
        try {
            ABC_082_A program = new ABC_082_A();
            program.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void run() throws IOException {
        readInput(inp);
        readInput(inp2);

        processInput(inp, qary1, slast);
        partition(qary1, qfirst, qlast);
        quickSort(qary1, qfirst, qlast);

        Arrays.fill(qary1, ' ');

        processInput(inp2, qary1, tlast);
        xlast = Math.min(slast, qlast);
        partition(qary1, qfirst, qlast);
        quickSort(qary1, qfirst, qlast);

        reverseCopy(qary1, tary1, tlast);

        compareArrays(sary1, tary1, xlast);

        System.out.println(judge == 0 ? "No" : "Yes");
    }

    private void readInput(char[] buffer) throws IOException {
        for (i = 0; i < buffer.length; i++) {
            buffer[i] = (char) System.in.read();
            if (buffer[i] == ' ') break;
        }
        slast = i - 1;
    }

    private void processInput(char[] input, char[] output, int last) {
        for (i = 0; i <= last; i++) {
            output[i] = input[i];
        }
        qfirst = 0;
        qlast = last;
    }

    private void partition(char[] array, int first, int last) {
        x = array[last];
        a = first - 1;

        for (b = first; b < last; b++) {
            if (array[b] <= x) {
                a++;
                swap(array, a, b);
            }
        }
        swap(array, ++a, last);
        q = a;
    }

    private void quickSort(char[] array, int first, int last) {
        if (first < last) {
            partition(array, first, last);
            if (first < last) {
                pushStack(first, last);
                quickSort(array, first, last);
            }
        }
    }

    private void pushStack(int first, int last) {
        if (sidx < STACK_SIZE) {
            stack1[sidx++] = new int[]{first, last};
        }
    }

    private void reverseCopy(char[] src, char[] dest, int last) {
        for (i = 0, j = last; i <= last; i++, j--) {
            dest[i] = src[j];
        }
    }

    private void compareArrays(char[] sary, char[] tary, int last) {
        for (i = 0; i <= last; i++) {
            if (sary[i] < tary[i]) {
                judge = 1;
                break;
            } else if (tary[i] < sary[i]) {
                judge = 0;
                break;
            }
        }
        if (tlast <= slast && judge == 9) {
            judge = 0;
        }
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
```