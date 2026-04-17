import java.util.Scanner;

public class Beginner {

    private static final int MAX_TABLE_SIZE = 20000;
    private static final int STRING_LENGTH = 10;
    private static final int NUM_LENGTH = 6;

    private String inp;
    private String dtX1;
    private int dtL1;
    private int inN;
    private String[] iStr = new String[MAX_TABLE_SIZE];
    private String[] iMax = new String[MAX_TABLE_SIZE];
    private String wStr;
    private int i;
    private int j;
    private int k;
    private int l;
    private int max;
    private int cntMax;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Beginner beginner = new Beginner();
        beginner.main001(scanner.nextLine());
        scanner.close();
    }

    private void main001(String inp) {
        this.inp = inp;
        unstring(inp);
        moveDtX1ToInN();

        for (i = 0; i < inN; i++) {
            acceptIstr(i);
        }

        if (inN > 1) {
            i = inN / 2;
            while (i > 0) {
                l = inN - i;
                k = 1;
                while (k <= l) {
                    j = k;
                    while (j > 0) {
                        if (iStr[j - 1].compareTo(iStr[j + i - 1]) > 0) {
                            wStr = iStr[j - 1];
                            iStr[j - 1] = iStr[j + i - 1];
                            iStr[j + i - 1] = wStr;
                            j -= i;
                        } else {
                            j = 0;
                        }
                    }
                    k++;
                }
                i /= 2;
            }
        }

        max = 0;
        i = 0;
        while (i <= inN) {
            j = i + 1;
            while (j <= inN && iStr[i].equals(iStr[j - 1])) {
                j++;
            }
            if (j - i > max) {
                max = j - i;
                cntMax = 1;
                iMax[cntMax - 1] = iStr[i];
            } else if (j - i == max) {
                cntMax++;
                iMax[cntMax - 1] = iStr[i];
            }
            i = j;
        }

        for (i = 0; i < cntMax; i++) {
            System.out.println(iMax[i]);
        }
    }

    private void unstring(String inp) {
        String[] parts = inp.split(" ");
        dtX1 = parts[0];
        dtL1 = dtX1.length();
    }

    private void moveDtX1ToInN() {
        inN = Integer.parseInt(dtX1.substring(0, dtL1));
    }

    private void acceptIstr(int index) {
        iStr[index] = new Scanner(System.in).nextLine();
    }
}