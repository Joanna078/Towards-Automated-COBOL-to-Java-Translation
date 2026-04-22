import java.util.Scanner;

public class Main {

    private int returnCode;
    private String n;
    private char[] s = new char[4000];
    private int i1;
    private int i2;
    private int i3;
    private int ir;
    private int ig;
    private int ib;
    private int ks;
    private int s1;
    private int s2;
    private int s3;
    private int out;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT N
        System.out.print("Enter N: ");
        n = scanner.nextLine();

        // ACCEPT S
        System.out.print("Enter S: ");
        scanner.next().getChars(0, Math.min(s.length, scanner.next().length()), s, 0);

        process();

        // DISPLAY OUT
        System.out.println("OUT: " + out);

        scanner.close();
    }

    private void process() {
        // Initialize tables
        int[] rnTbl = new int[4000];
        int[] gnTbl = new int[4000];
        int[] bnTbl = new int[4000];

        // Clear tables
        for (int i = 0; i < 4000; i++) {
            rnTbl[i] = 0;
            gnTbl[i] = 0;
            bnTbl[i] = 0;
        }

        // Initialize counters
        ir = 0;
        ig = 0;
        ib = 0;

        // Process each character in S
        for (i1 = 1; i1 <= 4000; i1++) {
            switch (s[i1 - 1]) {
                case 'R':
                    ir++;
                    rnTbl[ir - 1] = i1;
                    break;
                case 'G':
                    ig++;
                    gnTbl[ig - 1] = i1;
                    break;
                case 'B':
                    ib++;
                    bnTbl[ib - 1] = i1;
                    break;
            }
        }

        ks = 0;

        // Compare combinations
        for (i1 = 1; i1 <= ir; i1++) {
            for (i2 = 1; i2 <= ig; i2++) {
                for (i3 = 1; i3 <= ib; i3++) {
                    s1 = rnTbl[i1 - 1] - gnTbl[i2 - 1];
                    s2 = gnTbl[i2 - 1] - bnTbl[i3 - 1];
                    s3 = rnTbl[i1 - 1] - bnTbl[i3 - 1];

                    if (s1 != s2 && s1 != s3 && s2 != s3) {
                        ks++;
                    }
                }
            }
        }

        out = ks;
    }
}