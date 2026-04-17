import java.util.Arrays;

public class ABC_082_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = " ".repeat(101);
    private String inp2 = " ".repeat(101);
    private int i = 0;
    private int j = 0;
    private char[] sary1 = new char[100];
    private char[] tary1 = new char[100];
    private char[] qary1 = new char[100];
    private int[] stack1 = new int[1000];
    private int sidx = 0;
    private int nowidx = 0;
    private int sttmp = 0;
    private int edtmp = 0;
    private int a = 0;
    private int b = 0;
    private char t = ' ';
    private char x = ' ';
    private int qfirst = 0;
    private int qlast = 0;
    private int q = 0;
    private int slast = 0;
    private int tlast = 0;
    private int xlast = 0;
    private int ret = 0;
    private int bk = 0;
    private int zs = 0;
    private String ans = " ".repeat(5);
    private char dummy = ' ';
    private char flg = '0';
    private char judge = '9';

    public static void main(String[] args) {
        new ABC_082_A().execute();
    }

    public void execute() {
        runModule(0);
    }

    private void runModule(int entry) {
        if (entry < 0) {
            if (!initialized) {
                initialized = true;
                return;
            }
            Arrays.fill(sary1, ' ');
            Arrays.fill(tary1, ' ');
            Arrays.fill(qary1, ' ');
            Arrays.fill(stack1, 0);
            sidx = 0;
            nowidx = 0;
            initialized = false;
            return;
        }

        if (!initialized) {
            Arrays.fill(inp, ' ');
            Arrays.fill(inp2, ' ');
            Arrays.fill(sary1, ' ');
            Arrays.fill(tary1, ' ');
            Arrays.fill(qary1, ' ');
            Arrays.fill(stack1, 0);
            sidx = 0;
            nowidx = 0;
            flg = '0';
            judge = '9';
            initialized = true;
        }

        try {
            execEntry(0);
        } catch (Exception e) {
            System.exit(returnCode);
        }
    }

    private void execEntry(int start) {
        switch (start) {
            case 0:
                accept(inp);
                accept(inp2);
                processInput();
                break;
            case 1:
                partition();
                break;
            case 2:
                quickSort();
                break;
            default:
                throw new RuntimeException("Unknown entry point");
        }
    }

    private void accept(String input) {
        // Simulate accepting input
    }

    private void processInput() {
        // Process input logic
    }

    private void partition() {
        // Partition logic
    }

    private void quickSort() {
        // Quick sort logic
    }
}