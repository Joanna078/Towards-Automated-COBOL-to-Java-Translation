import java.util.Scanner;

public class Beginner {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private String inData = "";
    private int inLen = 0;
    private int inN = 0;
    private String[] inTable = new String[40000];
    private String wStr = "";
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int max = 0;
    private int cntMax = 0;
    private String[] iMaxTable = new String[20000];

    public static void main(String[] args) {
        new Beginner().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input:");
        inp = scanner.nextLine();
        scanner.close();

        unstring(inp, 1, " ", inData, inLen);
        inN = Integer.parseInt(inData);

        for (i = 1; i <= inN; i++) {
            System.out.println("Enter data for index " + i + ":");
            inTable[i - 1] = scanner.nextLine();
        }

        for (i = 1; i <= inN / 2; i++) {
            for (j = 1; j <= inN - i; j++) {
                if (inTable[j - 1].compareTo(inTable[j + i - 1]) > 0) {
                    wStr = inTable[j - 1];
                    inTable[j - 1] = inTable[j + i - 1];
                    inTable[j + i - 1] = wStr;
                }
            }
        }

        max = 0;
        cntMax = 0;

        for (i = 1; i <= inN; i++) {
            for (j = i; j <= inN; j++) {
                if (j - i > max) {
                    max = j - i;
                    cntMax = 1;
                    iMaxTable[cntMax - 1] = inTable[i - 1];
                } else if (j - i == max) {
                    cntMax++;
                    iMaxTable[cntMax - 1] = inTable[i - 1];
                }
            }
        }

        for (i = 1; i <= cntMax; i++) {
            System.out.println(iMaxTable[i - 1]);
        }
    }

    private void unstring(String source, int startPos, String delimiter, String[] target, int[] length) {
        String[] parts = source.split(delimiter);
        target[0] = parts[0];
        length[0] = parts[0].length();
    }
}