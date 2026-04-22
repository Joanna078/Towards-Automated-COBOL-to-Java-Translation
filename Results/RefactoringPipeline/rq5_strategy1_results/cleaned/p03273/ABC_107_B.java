import java.util.Scanner;

public class ABC_107_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private int ax = 1;
    private int hx = 1;
    private int wx = 1;
    private String inp = "       ";
    private String inp2 = "                                                                 ";
    private String h = "000";
    private String w = "000";
    private int i = 1;
    private int j = 1;
    private char[] a1 = new char[10000];
    private char[] cntH1 = new char[100];
    private char[] cntW1 = new char[100];
    private char flgH = '0';
    private char flgW = '0';
    private char[] st = new char[100];

    public static void main(String[] args) {
        new ABC_107_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().substring(0, Math.min(inp.length(), scanner.nextLine().length()));

        String[] parts = inp.split("\\s+");
        h = parts[0];
        w = parts[1];

        for (int i = 0; i < 100; i++) {
            cntH1[i] = '0';
            cntW1[i] = '0';
        }

        for (int i = 0; i < 10000; i++) {
            a1[i] = ' ';
        }

        mainSection();
    }

    private void mainSection() {
        for (i = 1; i <= Integer.parseInt(h); i++) {
            ax = i;
            System.out.print("Enter data for index " + ax + ": ");
            String data = new Scanner(System.in).nextLine();
            System.arraycopy(data.toCharArray(), 0, a1, (ax - 1) * 100, Math.min(100, data.length()));
        }

        flgH = '1';

        for (i = 1; i <= Integer.parseInt(h); i++) {
            ax = i;
            flgH = '1';
            for (j = 1; j <= Integer.parseInt(w); j++) {
                if (a1[(ax - 1) * 100 + (j - 1)] == '#') {
                    flgH = '0';
                    break;
                }
            }
            if (flgH == '1') {
                hx = i;
                cntH1[hx - 1] = '1';
            }
        }

        flgW = '1';

        for (i = 1; i <= Integer.parseInt(w); i++) {
            ax = i;
            flgW = '1';
            for (j = 1; j <= Integer.parseInt(h); j++) {
                if (a1[(j - 1) * 100 + (ax - 1)] == '#') {
                    flgW = '0';
                    break;
                }
            }
            if (flgW == '1') {
                wx = i;
                cntW1[wx - 1] = '1';
            }
        }

        for (i = 1; i <= Integer.parseInt(h); i++) {
            ax = i;
            if (cntH1[hx - 1] == '0') {
                for (j = 1; j <= Integer.parseInt(w); j++) {
                    if (cntW1[wx - 1] == '0') {
                        st[j - 1] = a1[(ax - 1) * 100 + (j - 1)];
                    } else {
                        st[j - 1] = ' ';
                    }
                }
                System.out.println(new String(st).trim());
            }
        }
    }
}