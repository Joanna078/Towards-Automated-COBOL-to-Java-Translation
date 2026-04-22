```java
import java.util.Scanner;

public class Main {

    private int returnCode;
    private String inp;
    private int h;
    private int w;
    private int k;
    private int cw;
    private int cb;
    private int cbW;
    private char[] tbl1 = new char[36];
    private char[] tblSv = new char[36];
    private int i;
    private int j;
    private int i1;
    private int j1;
    private int s;
    private int amr;
    private int cnt;
    private int out;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        unstring(inp, ' ', 1, new StringBuilder(), new StringBuilder(), new StringBuilder());

        h = Integer.parseInt(new String(tbl1, 0, 2).trim());
        w = Integer.parseInt(new String(tbl1, 2, 2).trim());
        k = Integer.parseInt(new String(tbl1, 4, 2).trim());

        performOuterLoop(h, w, k);
        move(tbl1, tblSv);

        if (cb < k) {
            cnt = 0;
        } else {
            performInnerLoops(h, w, k);
        }

        out = cnt;
        System.out.println("Output: " + out);
    }

    private void unstring(String input, char delimiter, int count, StringBuilder sb1, StringBuilder sb2, StringBuilder sb3) {
        String[] parts = input.split(String.valueOf(delimiter), count);
        sb1.append(parts[0].trim());
        sb2.append(parts[1].trim());
        sb3.append(parts[2].trim());
    }

    private void performOuterLoop(int h, int w, int k) {
        for (i = 1; i <= h; i++) {
            acceptInput(i);
            performInnerLoop(w);
        }
    }

    private void acceptInput(int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for index " + index + ": ");
        String input = scanner.nextLine().trim();
        System.arraycopy(input.toCharArray(), 0, tbl1, (index - 1) * 6, Math.min(input.length(), 6));
    }

    private void performInnerLoop(int w) {
        for (j = 1; j <= w; j++) {
            if (tbl1[(j - 1) * 6] == '*') {
                cb += 1;
            } else {
                cw += 1;
            }
        }
    }

    private void move(char[] source, char[] destination) {
        System.arraycopy(source, 0, destination, 0, source.length);
    }

    private void performInnerLoops(int h, int w, int k) {
        for (i = 1; i <= h; i++) {
            for (j = 1; j <= w; j++) {
                if (tbl1[(j - 1) * 6] == '*') {
                    performInnermostLoop(j, h, w);
                }
            }
        }
    }

    private void performInnermostLoop(int j, int h, int w) {
        for (i1 = 1; i1 <= h; i1++) {
            for (j1 = 1; j1 <= w; j1++) {
                tbl1[(j1 - 1) * 6 + (i1 - 1)] = '*';
            }
        }
    }
}
```