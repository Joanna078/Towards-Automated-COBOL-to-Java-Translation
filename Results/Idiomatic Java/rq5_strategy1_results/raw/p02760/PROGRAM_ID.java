```java
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private Scanner scanner = new Scanner(System.in);

    private String inp = "";
    private String cur = "0000000001";
    private String i = "000000000000000001";
    private String j = "000000000000000000";
    private String jix = "000000000000000001";
    private String len = "0000000000";
    private int N = 0;
    private int num = 51;
    private int nm = 0;
    private int ans = 0;
    private int flg = 0;
    private int[] y = new int[100];
    private int[] x = new int[100];
    private int[] tate = new int[3];
    private int[] yoko = new int[3];
    private int[] naname = new int[2];

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        initialize();
        mainSection();
        displayResult();
    }

    private void initialize() {
        for (int i = 0; i < 100; i++) {
            y[i] = 0;
            x[i] = 0;
        }
        for (int i = 0; i < 3; i++) {
            tate[i] = 0;
            yoko[i] = 0;
        }
        for (int i = 0; i < 2; i++) {
            naname[i] = 0;
        }
        initialized = true;
    }

    private void mainSection() {
        accept(inp, 399);
        cur = "0000000001";
        jix = "000000000000000001";

        for (int n0 = num; n0 > 0; n0--) {
            accept(inp, 399);
            cur = "0000000001";
            jix = "000000000000000001";

            for (int n1 = num; n1 > 0; n1--) {
                j = cur;
                while (inp.charAt(Integer.parseInt(j) - 1) == ' ') {
                    j = Integer.toString(Integer.parseInt(j) + 1);
                }
                len = Integer.toString(Integer.parseInt(j) - Integer.parseInt(cur));
                nm = Integer.parseInt(len);

                y[nm - 1] = Integer.parseInt(i);
                x[nm - 1] = Integer.parseInt(jix);

                cur = Integer.toString(Integer.parseInt(cur) + 1);
                jix = Integer.toString(Integer.parseInt(jix) + 1);
            }
            i = Integer.toString(Integer.parseInt(i) + 1);
        }

        accept(N, 3);

        for (int n2 = N; n2 > 0; n2--) {
            accept(nm, 3);

            if (y[nm - 1] != -1) {
                yoko[y[nm - 1] - 1]++;
                if (yoko[y[nm - 1] - 1] == num) {
                    flg = 1;
                    break;
                }

                tate[x[nm - 1] - 1]++;
                if (tate[x[nm - 1] - 1] == num) {
                    flg = 1;
                    break;
                }

                if (y[nm - 1] == x[nm - 1]) {
                    naname[0]++;
                    if (naname[0] == num) {
                        flg = 1;
                        break;
                    }
                }

                if (y[nm - 1] == num - x[nm - 1]) {
                    naname[1]++;
                    if (naname[1] == num) {
                        flg = 1;
                        break;
                    }
                }
            }
        }
    }

    private void accept(String variable, int length) {
        System.out.print("Enter value for " + variable + ": ");
        variable = scanner.nextLine();
        if (variable.length() > length) {
            variable = variable.substring(0, length);
        }
    }

    private void displayResult() {
        if (flg == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```