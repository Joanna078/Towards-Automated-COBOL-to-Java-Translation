```java
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private String s1 = "";
    private String s2 = "";
    private int n = 0;
    private int[] tbl = new int[3];
    private char[] tbl1 = new char[100000];
    private int i = 0;
    private char j1 = '0';
    private char j2 = '0';
    private char j3 = '0';
    private char j4 = '0';
    private String cAbc = "ABC";
    private String out = "";

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT INP
        System.out.print("Enter input: ");
        inp = scanner.nextLine();

        // UNSTRING INP DELIMITED BY ' ' INTO N, TBL(1), TBL(2), TBL(3)
        String[] parts = inp.split(" ");
        n = Integer.parseInt(parts[0]);
        tbl[0] = Integer.parseInt(parts[1]);
        tbl[1] = Integer.parseInt(parts[2]);
        tbl[2] = Integer.parseInt(parts[3]);

        // MOVE "Yes" TO OUT
        out = "Yes";

        // ACCEPT S1
        System.out.print("Enter S1: ");
        s1 = scanner.nextLine();

        // PERFORM VARYING I FROM 1 BY 1 UNTIL I > N OR OUT = "No"
        for (i = 1; i <= n && !out.equals("No"); i++) {
            if (i == n) {
                // MOVE "32" TO S2
                s2 = "32";
            } else {
                // ACCEPT S2
                System.out.print("Enter S2: ");
                s2 = scanner.nextLine();
            }

            // EVALUATE S1
            switch (s1) {
                case "AB":
                    j1 = '1';
                    j2 = '2';
                    break;
                case "AC":
                    j1 = '1';
                    j2 = '3';
                    break;
                case "BC":
                    j1 = '2';
                    j2 = '3';
                    break;
            }

            // EVALUATE TBL(J1) AND TBL(J2)
            if (tbl[j1 - '1'] == 0 && tbl[j2 - '1'] == 0) {
                out = "No";
            } else if (tbl[j1 - '1'] < tbl[j2 - '1']) {
                // CONTINUE
            } else if (tbl[j1 - '1'] > tbl[j2 - '1']) {
                j3 = j2;
                j2 = j1;
                j1 = j3;
            } else if (tbl[j1 - '1'] == 1 && tbl[j2 - '1'] == 1) {
                // EVALUATE S2
                switch (s2) {
                    case "AB":
                        j3 = '1';
                        j4 = '2';
                        break;
                    case "AC":
                        j3 = '1';
                        j4 = '3';
                        break;
                    case "BC":
                        j3 = '2';
                        j4 = '3';
                        break;
                }

                // EVALUATE J1 AND J4
                if (j1 == j3) {
                    // CONTINUE
                } else if (j2 == j4) {
                    j2 = j1;
                    j1 = j4;
                } else {
                    j2 = j1;
                    j1 = j3;
                }
            }

            // ADD 1 TO TBL(J1)
            tbl[j1 - '1'] += 1;

            // SUBTRACT 1 FROM TBL(J2)
            tbl[j2 - '1'] -= 1;

            // MOVE C-ABC(J1) TO TBL1(I)
            tbl1[i - 1] = cAbc.charAt(j1 - '1');

            // MOVE S2 TO S1
            s1 = s2;
        }

        // DISPLAY OUT
        System.out.println(out.trim());

        // IF OUT = "Yes"
        if (out.equals("Yes")) {
            // PERFORM VARYING I FROM 1 BY 1 UNTIL I > N
            for (i = 1; i <= n; i++) {
                // DISPLAY TBL1(I)
                System.out.print(tbl1[i - 1]);
            }
        }

        // STOP RUN
        System.exit(returnCode);
    }
}
```